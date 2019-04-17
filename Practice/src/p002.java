import java.util.Scanner;

// 윤년 구하기

public class p002 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 0; i < 150; i++) {
			int inputYear = 0;
			inputYear = scan.nextInt();
			if (inputYear % 4 == 0 || inputYear % 100 == 0) {
				System.out.println(inputYear + "년은 윤년입니다.\n");
			} else {
				System.out.println(inputYear + "년은 윤년이 아닙니다.\n");
			} 
		}
	}
}
