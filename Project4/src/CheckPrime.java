// 입력된 숫자가 소수인지 구하기
import java.util.Scanner;

public class CheckPrime {
	public void doCheck() {

		while (true) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n검사할 숫자를 입력해주세요.");
		int inputNum = scanner.nextInt();
		if (inputNum < 1) {
			System.out.println("양수만 입력해주세요.");
			return;
		}
		
		boolean isPrimeNumber = true;
		for(int i = 2; i < inputNum / 2; i++) {
								
			if (inputNum % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		if (isPrimeNumber) {
			System.out.println("소수입니다.");
		} else {System.out.println("소수가 아닙니다.");
		}
		}
	}
	
	public static void main(String[] args) {
		CheckPrime check = new CheckPrime();
		check.doCheck();
	}
}
