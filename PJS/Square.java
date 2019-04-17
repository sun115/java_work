import java.util.Scanner;

public class Square extends Figure {
	int side1 = 0;
	String name = "정사각형";
	
	Scanner scanner = new Scanner(System.in);
	@Override
	public void inputVal() {
		// TODO Auto-generated method stub
		String tmp;
		System.out.println("정사각형 한 변의 길이를 입력하세요 (cm)");
		tmp = scanner.nextLine();
		this.side1 = Integer.parseInt(tmp);
				
	}
	public void printResult() {
		double area = 0;
		area = (double)this.side1*this.side1;
		System.out.println("한 변의 길이가"+ this.side1 + "cm인 " + this.name + "의 넓이는" + area + "(cm^2)입니다." );
	}

	

}
