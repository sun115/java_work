import java.util.Scanner; //ctrl+Shift +f는 정렬

public class Circle extends Figure {

	double pi = 3.14;

	Scanner scanner = new Scanner(System.in);
	public void inputVal() {
		System.out.println("반지름을 입력하세요");
		this.side1 = scanner.nextInt();
		this.pi = 3.14;

		area = (double) pi * (this.side1 * this.side1);

	}

	public void printResult() {
		System.out.println("원의 넓이는:" + area);
	}

}
