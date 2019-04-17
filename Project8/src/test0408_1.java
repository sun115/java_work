import java.util.Scanner;

public class test0408_1 {
	int no1 = 0;
	int no2 = 0;
	public void inputNo() {
		System.out.println("두 개의 숫자를 입력해주세요");
		System.out.println("첫 번째 숫자 : ");
		Scanner scan = new Scanner(System.in);
		this.no1 = scan.nextInt();
		
		System.out.println("두 번째 숫자 : ");
		this.no2 = scan.nextInt();
		
	}
	
	public void printResult() {
		System.out.println("입력한 숫자는 "+this.no1+", "+this.no2+" 입니다.");
	}

}
