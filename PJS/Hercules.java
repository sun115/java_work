import java.util.Scanner;

public  class Hercules extends Figure {
	@Override
	public void inputVal() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("input side a :");
		System.out.println("input side b :");
		System.out.println("input Height h :");
		this.side1 = scan.nextInt();
		this.side2 = scan.nextInt();
		this.height = scan.nextInt();
		this.area = 0.5*(side1 + side2)*height;
	}
	
	@Override
	public void printResult() {
		super.printResult();
		System.out.printf("사다리꼴의 넓이 (변 A : %d, 변 B : %d, 높이 : %d) : %fcm2", this.side1, this.side2, this.height, this.area);
	}

}
