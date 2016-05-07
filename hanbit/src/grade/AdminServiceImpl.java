package grade;

import java.util.ArrayList;
import java.util.List;

public class AdminServiceImpl implements AdminService{
	List<GradeBean> list;
	
	public  AdminServiceImpl() {
		list = new ArrayList<GradeBean>();
	}
	@Override
	public String regist(String id, String name, int kor, int eng, int math, int java) {
		// 학생부등록
		return null;
	}

	@Override
	public GradeBean findbyByID(String id) {
		// id도회
		return null;
	}

	@Override
	public List<GradeBean> findbyByName(String name) {
		// 이름으로조회
		return null;
	}

	@Override
	public String remove(String id) {
		// 전체학생수
		return null;
	}

	@Override
	public int countAll() {
		// 전체학생목록
		return 0;
	}

	@Override
	public List<GradeBean> list() {
		// TODO Auto-generated method stub
		return null;
	}


	}


