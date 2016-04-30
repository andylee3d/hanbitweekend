package gradeA;

public interface GradeService {
	// 총점 구하기
		public int getTotal(GradeBean grade);

		// 평균구하기
		public int getAvg(GradeBean grade);

		// 학점구하기 getGrade
		/*
		 * 
		 * 평균 점수가 
		 * 90이상A 
		 * 80이상B 
		 * 70이상C 
		 * 60이상D 
		 * 50이상E 
		 * 50미만F 
		 * F학점입니다
		 **/
		public String getGrade(GradeBean grade);
}
