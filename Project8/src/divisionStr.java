import java.util.Scanner;

public class divisionStr {
	String temp;
	int inputNum1;
	int inputNum2;
	double result;
	
	public void division() {
		for (int i = 0; i < 100; i++) {
			System.out.print("\n나눌 두 숫자를 입력해주세요.\n숫자1 : ");
			Scanner scan = new Scanner(System.in);
			
			try {
				temp = scan.nextLine();
				inputNum1 = Integer.parseInt(temp);
				System.out.print("숫자2 : ");
				temp = scan.nextLine();
				inputNum2 = Integer.parseInt(temp);
				result = (double)inputNum1 / inputNum2;
				System.out.printf("\n%d 나누기 %d 는 %.2f 입니다.\n", inputNum1, inputNum2, result);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("\n^숫자만 입력하시오.^");
			}
			
//			System.out.println("숫자 2 : ");
//			temp = scan.nextLine();
//			try {
//				inputNum2 = Integer.parseInt(temp);
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("숫자만 입력해.");
//			}
			
//			result = (double)inputNum1 / inputNum2;
//			result = Double.parseDouble(String.format("%.2f",temp));
//			System.out.println(inputNum1 + " 나누기 " + inputNum2 + " = " + result + "입니다.");
//			System.out.printf("\n%d 나누기 %d 는 %.2f 입니다.", inputNum1, inputNum2, result);
		}
	}
}
