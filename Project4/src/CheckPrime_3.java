// 1부터 100까지의 숫자 중 소수 출력하기

public class CheckPrime_3 {
	public void printprime () {
	
		System.out.println("소수인 숫자는?");
		for (int i = 0; i<101; i++) {
//			int prime = i;
			
			boolean isPrimeNumber = true;
			for(int j = 2; j < 100; j++) {
				if (i != j && i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			
			if (isPrimeNumber) {
				System.out.print(i + " ");}
//			else {System.out.println(i + "는 소수가 아닙니다.");}
		}
	}

	public static void main(String[] args) {
		CheckPrime_3 check = new CheckPrime_3();
		check.printprime();
		
	}
}
