import java.io.IOException;
import java.util.Scanner;

public class Gugudan2 {
	int dan;
	
	public void gugu() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요?");
		
		String ipTxt = scan.nextLine();
		try {
			this.dan = Integer.parseInt(ipTxt);
		}  catch (Exception e) {
			
		}
		// 실제로 오류는 아니지만 상황적으로 오류일 경우 예외를 추가
		if (this.dan == 0) {
			throw new Exception("not allow '0'");
		}
		this.printResult();
	}
	
	private void printResult() {
		for (int j = 1; j <= 9; j++) {
			int val = this.dan * j;
			System.out.println("" + this.dan + " X " + j + " = " + val);
		}
		
	}
}
