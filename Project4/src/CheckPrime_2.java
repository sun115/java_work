import java.util.Scanner;

public class CheckPrime_2 {
		public void doCheck2() {
			
			while (true) {
				System.out.println("확인하고 싶은 숫자를 입력하세요.");
				Scanner scan = new Scanner(System.in);
				int inputNum = scan.nextInt();
				
				boolean isPrimeNumber = true;
				for (int i = 2; i < inputNum; i++) {

					if (inputNum % i == 0) {
						isPrimeNumber = false;
						break;
					}
				}
				if (isPrimeNumber) {
					System.out.println("소수입니다.");
				} else {
					System.out.println("소수가 아닙니다.");
				} 
			}
			}
		
		public static void main(String[] args) {
			CheckPrime_2 check2 = new CheckPrime_2();
			check2.doCheck2();
		}
}

