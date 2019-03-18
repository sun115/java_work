//	 홀짝 합계 구하기
//	1~100까지 총합, 홀짝 합 구하기.
//	if문은 한 번만 사용하기. (else 불가)

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class for_3 {
	public static void main(String[] args) {
		int sum;
		sum = 0;
		for (int i = 0; i <101; i++)
		sum += i;
		System.out.println(sum);
		
		int oddsum;
		oddsum = 0;
		for(int a = 0; a < 101; a++)
			if (a%2 == 1) {
				 
			}
		oddsum += a;
		System.out.println(oddsum);
		
		
	}
}
