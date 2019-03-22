//	사용자에게 9개의 숫자를 입력받아서3*3의 이중 배열에 넣은 후 각행의 덧셈 합을 출력하시오.
//	조건1)출력 시4*4의 형식으로 출력 (4행째는 덧셈 합)
//	조건2) 데이터 출력시 정렬된 형식으로 출력
//	비고.이중배열 사용법 int[][] arr =new int[4][4];
//	비고.데이터를 정렬된 형식으로 출력하는 방법을 찾아보시오.

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Array_Quiz2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int[][] arr = new int [4][4];
		
		int len = 0;
		len = arr.length;
		
		System.out.println("숫자를 입력해 주세요. ");
		for (int i = 0; i < len-1; i++) {
			for (int j = 0; j < len - 1; j++) {
				arr[i][j] = input.nextInt();
				}
		} System.out.println();
		
//		for (int i = 0; i < arr.length-1; i++) {
//			int sum = 0;
//			int sum2 = 0;
//			for (int j = 0; j < arr.length; j++) {
//				sum += arr[i][j];
//				sum2 += arr[j][i];
//			}
//			arr[i][3] = sum;
//			arr[3][i] = sum2;
//		}
		
		
		for (int i = 0; i < len-1; i++) {
			int sum = 0;
			int sum2 = 0;
			for (int j = 0; j < len; j++) {
				sum += arr[i][j];
				sum2 += arr[j][i];
			}
			arr[i][len-1] = sum;
			arr[len-1][i] = sum2;
		}
		
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(arr[i][j] + " ");
				}
			System.out.println();
		}
	}
}
