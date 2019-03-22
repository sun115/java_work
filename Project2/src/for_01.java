import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class for_01 {
	public static void main(String[] args) {
		int score1;
		int score2;
		int score3;
		
//		직접 점수 입력하기
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수를 입력해주세요.");
		score1 = scan.nextInt();
		score2 = scan.nextInt(); 
		score3 = scan.nextInt();

//		점수들을 하나의 변수에 넣기
		int[] scores = new int[] {score1, score2, score3};
		System.out.println("\n꼴찌부터 출력\n");
		Arrays.sort(scores);
		for (int a: scores) {
			System.out.println(a);}
		
		System.out.println("\n국어점수의 총점은 ");
		int sum;
		sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];}
		System.out.println(sum);
		
		System.out.println("\n국어점수의 평균은 ");
		double average;
		average = 0;
		average = sum / scores.length;
		System.out.println(average);

//		램덤 점수 입력받기
//		Random rand = new Random();
//		
//		int totalScore = 0;
//		for (int i = 0; i < 3; i++) {
//			int randNumber = rand.nextInt(101);
//			System.out.println("국어점수 : " + randNumber);
//			totalScore = totalScore + randNumber;}
//		System.out.println("\n총점은 " + totalScore + "입니다.");
//		
//		double average;
//		average = (double)totalScore / 3;
//		System.out.println("\n평균은 " + average + "입니다.");
//		
}
}
