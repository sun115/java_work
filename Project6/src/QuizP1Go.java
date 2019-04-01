
public class QuizP1Go {
	public static void main(String[] args) {
		QuizP1[] sArr = new QuizP1[5];
		System.out.println(sArr.length);
		for (int i=0; i<sArr.length; i++) {
			sArr[i] = new QuizP1();
			sArr[i].inputScore();
		}
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		for (int i=0; i<sArr.length; i++) {
			korTotal = korTotal + sArr[i].korScore;
			engTotal = engTotal + sArr[i].engScore;
			mathTotal = mathTotal + sArr[i].mathScore;
		}
		System.out.println("국어 총점은 : " + korTotal);
		System.out.println("영어 총점은 : " + engTotal);
		System.out.println("수학 총점은 : " + mathTotal);
		
		System.out.println("국어 평균은 : " + (double)korTotal/sArr.length);
		System.out.println("영어 평균은 : " + (double)engTotal/sArr.length);
		System.out.println("수학 평균은 : " + (double)mathTotal/sArr.length);
	}

}
