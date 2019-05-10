//	사용자에게 9개의 숫자를 입력받아서3*3의 이중 배열에 넣은 후 각행의 덧셈 합을 출력하시오.
//	조건1)출력 시4*4의 형식으로 출력 (4행째는 덧셈 합)
//	조건2) 데이터 출력시 정렬된 형식으로 출력
//	비고.이중배열 사용법 int[][] arr =new int[4][4];
//	비고.데이터를 정렬된 형식으로 출력하는 방법을 찾아보시오.

// 190425 새로풀어보기!

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_Quiz1 {
	public static void main(String[] args) {
		int[][] arr = new int [4][4];
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
//		int k = 0;
		for (int i = 0; i < arr.length-1; i++) {
//			int tmp = 0;
//			int tmp2 = 0;
			
			for (int j = 0; j < arr.length-1; j++) {
				int tmp = rand.nextInt(5);
				arr[i][j] = tmp;
				arr[i][3] += tmp;
				arr[3][j] += tmp;
				
//				int tmp = rand.nextInt();
//				arr[i][j] = rand.nextInt(5);
//				tmp += arr[i][j];
//				arr[i][3] = tmp;
//				tmp2 += arr[j][k];
//				arr[3][k] = tmp2;
			}
//			k++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		
	}
}
