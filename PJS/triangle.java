import java.util.Scanner;

public class triangle extends Figure{

	
	@Override
	public void inputVal() {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("구하고 싶은 삼각형의 밑변과 높이를 입력해주세요.");
		
		this.side1 = scan.nextInt();
		this.height = scan.nextInt();
		
		this.area = (this.side1*this.height)/2;
		
	}
	
	public void printResult() {
		System.out.println("삼각형의 넓이는 " + this.area + "cm2 입니다.");
	}

}
