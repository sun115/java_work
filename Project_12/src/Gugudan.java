// 구구단 프로그램 작성
// 클래스 방식으로 구현 (클래스 작성 후 구성)
// 사용자가 원하는 단을 입력하면 해당 단의 구구단을 출력
// (사용자가 입력하는 값은 문자열로 받고 숫자로 변환)

import java.util.Scanner;

public class Gugudan  {
	int dan;
	
	public void gugu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요?");
		
		try {
			String ipTxt = scan.nextLine();
			this.dan = Integer.parseInt(ipTxt);
//			this.printResult();				// 예외처리 전에 실행문을 넣으면 실행도 안됨. (윗줄에서 오류나면 바로 캐치로 넘기기 때문)
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(); 			// 에러 메세지 띄워줌
			System.out.println("\n'장난금지'");
//			this.printResult();
		}
//		this.printResult();					// 예외처리 이후에 실행문을 넣으면 어쨌든 실행됨.
	}
	
	private void printResult() {
		for (int j = 1; j <= 9; j++) {
			int val = this.dan * j;
			System.out.println("" + this.dan + " X " + j + " = " + val);
		}
		
	}

}
