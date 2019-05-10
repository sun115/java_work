import java.util.Scanner;

public class Triangle implements Figure02 <Triangle>{

	
	@Override
	public void printResult(Triangle o) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name = "도형 넓이 구하기";
		int side1 = scan.nextInt();
		int side2 = scan.nextInt();
		int height = scan.nextInt();
		double area;
		
		Triangle tri = new Triangle();
		tri.inputVal();
		tri.printResult();
	}

	@Override
	public void inputVal(Triangle o) {
		// TODO Auto-generated method stub
		System.out.println("구하고 싶은 삼각형의 밑변과 높이를 입력해주세요.");
		Triangle tri = new Triangle();
		tri.area = (side1*height)/2;
		
	}

	@Override
	public void printResult(Triangle o) {
		// TODO Auto-generated method stub
		
	}
}