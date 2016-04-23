package grade;

public class GradeServiceImpl implements GradeService{
	// ====맴버메소드 영역(스코프)
	// 총점 구하기
	public int getTotal(GradeBean grade) {
		int total = grade.getKor() + grade.getEng() + grade.getMath()+grade.getJava();
		return total;
	}

	// 평균구하기
	public int getAvg(GradeBean grade) {
		int avg = (getTotal(grade))/3;
		return avg;

	}

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
	public String getGrade(GradeBean grade) {
		String result = "";
		// 알고리즘
		switch (((getTotal(grade)) /3)/ 10) {
		case 10:result = "A";break;
		case 9:result = "A";break;
		case 8:result = "B";break;
		case 7:result = "C";break;
		case 6:result = "D";break;
		case 5:result = "E";break;

		default:
			result = "E";
			break;
		}

		return result;

	
}

}
