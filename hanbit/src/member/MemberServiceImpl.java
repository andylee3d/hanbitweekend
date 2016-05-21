package member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.RowFilter.Entry;

public class MemberServiceImpl implements MemberService {
	Map<String, MemberBean> map;
	MemberBean mSession;

	public MemberServiceImpl() {
		map = new HashMap<String, MemberBean>();
		mSession = new MemberBean();
	}

	@Override
	public String join(MemberBean member) {
		String result = "가입성공";
		if (map.containsKey(member.getId())) {
			result = "아이디가 이미 존재합니다";
		}
		map.put(member.getId(), member);
		return result;
	}

	@Override
	public void update(MemberBean member) {
		mSession.setPwd(member.getPwd());
		map.put(mSession.getId(), mSession);
	}

	@Override
	public void delete() {
		map.remove(mSession.getId());
	}

	@Override
	public MemberBean finfByID(String id) {
		return map.get(id);
	}

	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> list = new ArrayList<MemberBean>();
		/*
		Iterator<String> keys = map.keySet().iterator();
		
		while (keys.hasNext()) {
			String key = (String) keys.next();
			if (map.get(key).getName().equals(name)) {
				list.add(map.get(key));
			}
		}
		*/
		for(String key: map.keySet()){
			if (name.equals(map.get(key).getName())) {
				list.add(map.get(key));
			}
		}
		return list;
	}

	@Override
	public String login(String id, String pwd) {
		String result = "로그인실패";
		if (map.containsKey(id)) {
			if (pwd.equals(map.get(id).getPwd())) {
				mSession = map.get(id);
				result = "로그인 성공";
			}

		}
		return result;
	}

	@Override
	public int countByGen(String gen) {
		int idx = 0;
		for(String key : map.keySet()){
			if (gen.equals(map.get(key).getGender())) {
				idx++;
			}
		}
		
		return idx;
	}

	@Override
	public MemberBean detail() {
		return mSession;
	}

}
