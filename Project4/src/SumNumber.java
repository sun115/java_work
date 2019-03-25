import java.util.Scanner;

public class SumNumber {
	public void doSum() {
		int num1 = 0;
		int num2 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 : ");
		num1 = scan.nextInt();
		
		System.out.println("숫자 : ");
		num2 = scan.nextInt();
		
		Sum2 sum2 = new Sum2();
		int result = sum2. sumNumbers(num1, num2);
		
		System.out.println("두 개의 숫자의 합은 " + result + "입니다.");
	}
	
	public void hello() {
		System.out.println("Hello Java");
	}
}