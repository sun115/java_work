import java.util.Random;

//	 총 100명의 성적 데이터를 생성한 후 성적이 올라간 학생들을 출력하시오.
//	(제약 사항)
//	1) student 클래스의 객체 데이터를 생성하고 랜덤한 값을 생성해서 성적 데이터를 입력
//	2) 성적 데이터는 중간고사 성적 (국어, 영어, 수학), 기말고사 성적 (국어, 영어, 수학) 을 입력. 즉 3과목의 성적 데이터를 중간고사와 기말고사로 구분해서 입력함.

public class Student {
	String name;
	double midAvg;
	double finAvg;

	public void doTest() {

		double[] midScores = new double[3];
		double[] finalScores = new double[3];

		Random rand = new Random();
		for (int i = 0; i < midScores.length; i++) {
			midScores[i] = rand.nextInt(101); // 국,영,수 3과목을 랜덤으로 받는다.
			finalScores[i] = rand.nextInt(101);
		}

		int midTotal = 0;
		int finTotal = 0;
		for (int i = 0; i < finalScores.length; i++) {
			midTotal += midScores[i];
			finTotal += finalScores[i];
		}
		this.midAvg = midTotal / midScores.length;
		this.finAvg = finTotal / finalScores.length;

	}

	public String print() {
		return this.name + " (중간평균 : " + this.midAvg + ", 기말평균 : " + this.finAvg + ")";

	}

}
