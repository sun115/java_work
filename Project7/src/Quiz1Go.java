import java.util.Scanner;

public class Quiz1Go {
	public static void main(String[] args) {
		Quiz1 []qArray = new Quiz1[5];
		Quiz1 etc = new Quiz1();
		
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<qArray.length; i++) {
			qArray[i] = new Quiz1();
			System.out.println("" + (i+1) + "번 학생 데이터 입력");
			System.out.print("이름 : ");
			qArray[i].name = scan.nextLine();
			System.out.print("국어점수 : ");
			String korString = scan.nextLine();
			qArray[i].korScore = Integer.parseInt(korString);
			System.out.print("영어점수 : ");
			String engString = scan.nextLine();
			qArray[i].engScore = Integer.parseInt(engString);
			System.out.print("수학점수 : ");
			String mathString = scan.nextLine();
			qArray[i].mathScore = Integer.parseInt(mathString);
			
			int t = qArray[i].korScore + qArray[i].engScore + qArray[i].mathScore;
			double a = t/3;
		}
		double t = 0;
//		double a = 0;
		for (int i=0; i<qArray.length; i++) {
			
//			korTotal = korTotal + sArr[i].korScore;
//			engTotal = engTotal + sArr[i].engScore;
//			mathTotal = mathTotal + sArr[i].mathScore;
//			
			
			t = t + (qArray[i].korScore + qArray[i].engScore + qArray[i].mathScore);
			
		}
		
		System.out.println("\n총점 : " + t);
		
//		double a = qArray.average;
		System.out.println("평균 : " + t/qArray.length);
			
	}

}
