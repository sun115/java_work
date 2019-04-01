import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
//		student s1 = new student();
//		s1.korScore = 100;
//		s1.engScore = 90;
//		s1.mathScore = 80;
//		s1.memo = "머리가 좋음"
		
		student[] sArray = new student[10];
//		sArray[0].name = "박종선";
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = new student();
			// 인덱스를 변수로 지정하려면 그 변수도 사용하려는 클래스에 넣어줘야함.
			System.out.println(""+ (i+1) + "번째 학생 데이터 입력");
			
			System.out.println("이름 : ");
			sArray[i].name = scan.nextLine();
			
			System.out.println("국어점수 : ");
			String korString = scan.nextLine();
			sArray[i].korScore = Integer.parseInt(korString);
			
			System.out.println("영어점수 : ");
			String engString = scan.nextLine();
			sArray[i].engScore = Integer.parseInt(engString);
			
			System.out.println("수학점수 : ");			
			String mathString = scan.nextLine();
			sArray[i].mathScore = Integer.parseInt(mathString);
//			scan.nextLine();
		}
	}

}
