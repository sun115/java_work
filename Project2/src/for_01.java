import java.util.Scanner;
import java.util.Arrays;

public class for_01 {
	public static void main(String[] args) {
		int score1;
		int score2;
		int score3;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���������� �Է����ּ���.\n");
		score1 = scan.nextInt();
		score2 = scan.nextInt();
		score3 = scan.nextInt();

		int[] scores = new int[] {score1, score2, score3};
		System.out.println("\n������� ���\n");
		Arrays.sort(scores);
		for (int a: scores) {
			System.out.println(a);}
		
		System.out.println("\n ���������� ������ ");
		int sum;
		sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];}
		System.out.println(sum);
		
		System.out.println("\n ���������� ����� ");
		double average;
		average = 0F;
		average = sum / scores.length;
		System.out.println(average);
}
}
