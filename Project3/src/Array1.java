import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		int[]arr2 =arr;
		int[]arr3 =arr2;
		arr3[0] =10;
		System.out.println(arr[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}
