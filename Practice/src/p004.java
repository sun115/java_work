import java.util.Scanner;

// 백준 단계별-입출력-그대로 출력하기 

public class p004 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputStr = "";
		
		
		for (int i = 1; i <= 100; i++) {
			inputStr = scan.nextLine();
			scan.nextLine();
			if(inputStr.length()>100) {
				inputStr = inputStr.substring(0,100);
			} else if (inputStr=="\n") {}
			System.out.println(inputStr);
		}
	}
}
