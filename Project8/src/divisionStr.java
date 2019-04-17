import java.util.Scanner;

public class divisionStr {
	String temp;
	int inputNum1;
	int inputNum2;
	double result;
	
	public void division() {
		for (int i = 0; i < 100; i++) {
			System.out.println("\n나눌 두 숫자를 입력해주세요.\n숫자 1 : ");
			Scanner scan = new Scanner(System.in);
			temp = scan.nextLine();
			try {
				inputNum1 = Integer.parseInt(temp);
			} catch (Exception e) {
				// TODO: handle exception
//				System.out.println("숫자만 입력해.");
			}
			
//			System.out.println("숫자 2 : ");
			temp = scan.nextLine();
			try {
				inputNum2 = Integer.parseInt(temp);
			} catch (Exception e) {
				// TODO: handle exception
//				System.out.println("숫자만 입력해.");
			}
			
			result = (double)inputNum1 / inputNum2;
//			result = Double.parseDouble(String.format("%.2f",temp));
//			System.out.println(inputNum1 + " 나누기 " + inputNum2 + " = " + result + "입니다.");
			System.out.printf("\n%d 나누기 %d 는 %.2f 입니다.", inputNum1, inputNum2, result);
		}
	}
}
