package grade;

import java.util.List;

import bank.AccountBean;

public interface AdminService {
	
	//1. 학생부에 학생
	public String regist(String id, String name, 
			int kor, int eng, int math, int java);
	 //2.id로해당학생정보 조회
	public GradeBean findbyByID(String id);
	 // 3.이름으로 학생정보(단,동명이인 다 출력
	public List<GradeBean> findbyByName(String name);
	 // 4. 계좌 해지
	public String remove(String id);
	//.전체 학생수
	public int countAll();
	public List<GradeBean> list();
}


