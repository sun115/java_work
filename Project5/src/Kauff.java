import java.util.Scanner;

public class Kauff {
	public double weight;
	public int height;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("몸무게(kg) : ");
		this.weight = scan.nextDouble();
		System.out.print("키(cm) : ");
		this.height = scan.nextInt();
	}
	
	public void kauff () {
		double kauff = 0;
		double height2 = 0;
		height2 = Math.pow(((double)this.height/100), 2);
		kauff = this.weight / height2;
		System.out.println(height2);
//		System.out.println(((double)this.height/100));
		
		if (kauff >= 30) {
			System.out.println("카우프 지수는 " + kauff + ", 비만");
		} else if (24 <= kauff && kauff < 29) {
			System.out.println("카우프 지수는 " + kauff + ", 과체중");
		} else if (20 <= kauff && kauff < 24) {
			System.out.println("카우프 지수는 " + kauff + ", 정상");
		} else if (15 <= kauff && kauff < 20) {
			System.out.println("카우프 지수는 " + kauff + ", 저체중");
		} else if (13 <= kauff && kauff < 15) {
			System.out.println("카우프 지수는 " + kauff + ", 여윔");
		} else if (10 <= kauff && kauff < 13) {
			System.out.println("카우프 지수는 " + kauff + ", 영양 실조증");
		} else if (kauff < 10) {
			System.out.println("카우프 지수는 " + kauff + ", 소모증");
		} 
	}
}