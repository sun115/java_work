import java.util.Scanner;

public class FigureRun {
	public static void main(String[] args) {
		Figure fig = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("넓이를 구하고 싶은 도형을 고르세요.\n1. 삼각형\n2. 사각형\n3. 원\n4. 사다리꼴\n5. 팔각형");
		int selectNum = scan.nextInt();
		
		if(selectNum==1) {
			fig = new triangle();
		} else if(selectNum==2) {
			fig = new Square();
		} else if(selectNum==3) {
			fig = new Circle();
		} else if(selectNum==4) {
			fig = new Hercules();
		}else {
			fig = new Octagon();		}
		
		fig.inputVal();
		fig.printResult();
		
	}
}
