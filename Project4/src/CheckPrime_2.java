
public class CheckPrime_2 {
		public void doCheck2(int input) {
			int inputNum = input;
									
//			if (inputNum < 1) {
//				System.out.println("양수만 입력해주세요.");
//				return;
//			}
			
			boolean isPrimeNumber = true;
			for(int i = 2; i < inputNum; i++) {
									
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
		
		public static void main(String[] args) {
			CheckPrime_2 check2 = new CheckPrime_2();
			check2.doCheck2(4);
		}
}

