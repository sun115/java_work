import java.util.Scanner;

// 동전 교환기

public class p001 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNum = 0;
		inputNum = scan.nextInt();
		
		while(true) {
				
			if (inputNum>500) {
				int big = inputNum / 500;
				System.out.println("오백원짜리 => " + big);
				inputNum -= (big*500);
			} else if(inputNum>100) {
				int mid = inputNum / 100;
				System.out.println("백원짜리 => " + mid);
				inputNum -= mid*100;
			} else if (inputNum>50){
				int small = inputNum/50;
				System.out.println("오십원짜리 => " + small);
				inputNum -= small*50; 
			} else if (inputNum>10) {
				int tiny = inputNum / 10;
				System.out.println("십원짜리 => " + tiny);
				inputNum -= tiny*10;
			} else {
				System.out.println("잔돈 => " + inputNum);
				break;
			}
			
		}
	}

}
