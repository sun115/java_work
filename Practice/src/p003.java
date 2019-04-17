// Array를 콘솔창에 출력하기

import java.util.Arrays;

public class p003 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		
		for (int j = 0; j < arr.length; j++) {
			arr[j] = j+1;
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
