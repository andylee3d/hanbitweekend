package member;

import java.util.List;

public interface MemberService {
	//CRUD
	// add,find, update, delete
	public String join(MemberBean member);
	public String login(String id, String pwd);
	public MemberBean detail();
	public void update(MemberBean member);
	public void delete();

	public MemberBean finfByID(String id);
	public List<MemberBean> findByName(String name); //배열하기 list
	public int  countByGen(String gen); //배열하기 list
	
	
}
