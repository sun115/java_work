//import java.util.Random;
//	public class Practice_calculate {
//			public static void main(String[] args) {
//				Random r = new Random();
//				int randomValue = r.nextInt(982);
//				System.out.println("������ ���� : ");
//				System.out.println(randomValue);
//				
//				int nVal;
//				nVal = randomValue%2;
//				System.out.println("������ ���� : ");
//				System.out.println(nVal);

import java.util.Random;

public class NumberChecker {
	public static void main(String[] args) {
		Random ran1 = new Random();
		
		int no1 = ran1.nextInt(999);
		int no2 = ran1.nextInt(999);
		
		System.out.println("���� ���� 1 : " + no1);
		System.out.println("���� ���� 2 : " + no2);
		// System.out.println("������ : " + (no1 % 2));
		
		if (no1 % 2 == 1) {
			System.out.println(no1 + " ��(��) Ȧ���Դϴ�.");
		} else {
			System.out.println(no1 + " ��(��) ¦���Դϴ�.");
		}
		if (no2 % 2 == 1) {
			System.out.println(no2 + " ��(��) Ȧ���Դϴ�.");
		} else {
			System.out.println(no2 + " ��(��) ¦���Դϴ�.");
		}
		
	}


	
}
