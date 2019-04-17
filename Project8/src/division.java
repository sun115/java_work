import java.util.Scanner;

public class division {
	int inputNum1;
	int inputNum2;
	double result;
	
	public void division() {
		for (int i = 0; i < 100; i++) {
			System.out.println("\n나눌 두 숫자를 입력해주세요.");
			Scanner scan = new Scanner(System.in);
			inputNum1 = scan.nextInt();
			inputNum2 = scan.nextInt();
			result = (double)inputNum1 / inputNum2;
//			result = Double.parseDouble(String.format("%.2f",temp));
//			System.out.println(inputNum1 + " 나누기 " + inputNum2 + " = " + result + "입니다.");
			System.out.printf("\n%d 나누기 %d 는 %.2f 입니다.", inputNum1, inputNum2, result);
		}
	}
}
