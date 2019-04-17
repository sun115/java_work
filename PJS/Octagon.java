import java.util.Scanner;

public class Octagon extends Figure {
	Scanner scan = new Scanner(System.in);
	
	public void inputVal() {		
		System.out.println("구하고 싶은 정팔각형의 변의 길이를 입력해주세요");
		this.side1 = scan.nextInt();
	}
	
	public void printResult() {		
		Double OctagonArea = 2*(Math.sqrt(2)-1)*(Math.pow(this.side1, 2));
		System.out.println("한변의 길이가 " + this.side1 + "인 정팔각형의 넓이는 " + OctagonArea + "입니다.");
	}

}
