// range 안의 랜덤 숫자를 10개 발생시켜 arr값으로 받는다.

import java.util.Arrays;

public class Rand {
	public static void main(String[] args) {
		Rand2 rand = new Rand2();
		int[] arr2 = rand.nextInt2(100);
		System.out.println(Arrays.toString(arr2));
	}
}
