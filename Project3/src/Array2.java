import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		int student = 10;
	//	학생 수만큼의 칸이 있는 배열을 만들거야.
		int[] korean = new int[student];
		int[] english = new int [student];
				
		Scanner inputKorean = new Scanner(System.in);
		Scanner inputEnglish = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해주세요.");
		for (int i = 0; i < korean.length; i++) {
			korean[i] = inputKorean.nextInt();
		}
		System.out.println(Arrays.toString(korean));
		
		int krtt = 0;
		double kravr = 0;
		
		for (int i = 0; i < korean.length; i++) {
			krtt = krtt + korean[i];
		}
		kravr = (double)krtt / korean.length;
		
		System.out.println("국어점수의 총점은 " + krtt);
		System.out.println("국어점수의 평균은 " + kravr);
		
		System.out.println();
		
		System.out.println("영어점수를 입력해주세요.");
		for (int i = 0; i < english.length; i++) {
			english[i] = inputEnglish.nextInt();
		} System.out.println(Arrays.toString(english));
		
		int egtt = 0;
		double egavr = 0;
		
		for (int i = 0; i < english.length; i++) {
			egtt = egtt + english[i];
		}
		egavr = (double)egtt / english.length;
		
		System.out.println("영어점수의 총점은 " + egtt);
		System.out.println("영어점수의 평균은 " + egavr);
	}
}
