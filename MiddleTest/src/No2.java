import java.util.Scanner;

//	사용자로 부터 숫자를 하나 입력 받고 입력 받은 숫자까지의 합과 곱을 구하시오.
//	(ex. 사용자로 부터 입력 받은 숫자 : 5, 결과 값 : 1~5까지 합 출력, 1~5까지 곱 출력 (5!))
//	(제약 사항)
//	1) 클래스 - 메서드 (객체 지향 프로그래밍) 방식으로 작성하세요.
//	2) 사용자로부터 입력 받은 숫자는 문자열로 입력을 받은 후 숫자로 변환하세요.

public class No2 {
	int inputNum;
	int sumNum;
	double mulNum = 1;
	
	public void calculation() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		String tmpNum = scan.nextLine();
		inputNum = Integer.parseInt(tmpNum);
		
		for (int i = 1; i <= inputNum; i++) {
			this.sumNum += i;
			
		}
 
        for (int i = inputNum; i >= 1; i--) {
            this.mulNum = mulNum * i;
        }
	}
	
	public String print() {
		return "사용자로부터 입력받은 숫자 : " + inputNum + " 결과 값 : " + this.sumNum + ",  " + this.mulNum;
	}

	
	
	public static void main(String[] args) {
		No2 cal = new No2();
		cal.calculation();
		System.out.println(cal.print());
		
	}
}
