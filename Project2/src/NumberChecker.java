//import java.util.Random;
//	public class Practice_calculate {
//			public static void main(String[] args) {
//				Random r = new Random();
//				int randomValue = r.nextInt(982);
//				System.out.println("임의의 값은 : ");
//				System.out.println(randomValue);
//				
//				int nVal;
//				nVal = randomValue%2;
//				System.out.println("나머지 값은 : ");
//				System.out.println(nVal);

import java.util.Random;

public class NumberChecker {
	public static void main(String[] args) {
		Random ran1 = new Random();
		
		int no1 = ran1.nextInt(999);
		int no2 = ran1.nextInt(999);
		
		System.out.println("랜덤 숫자 1 : " + no1);
		System.out.println("랜덤 숫자 2 : " + no2);
		// System.out.println("나머지 : " + (no1 % 2));
		
		if (no1 % 2 == 1) {
			System.out.println(no1 + " 은(는) 홀수입니다.");
		} else {
			System.out.println(no1 + " 은(는) 짝수입니다.");
		}
		if (no2 % 2 == 1) {
			System.out.println(no2 + " 은(는) 홀수입니다.");
		} else {
			System.out.println(no2 + " 은(는) 짝수입니다.");
		}
		
	}


	
}
