import java.util.Scanner;

public class Student4 {
	public String name;
	int midScore;
	int finScore;
	
	
	Student4(){ }
	
	Student4(String name){
		this.name = name;
	}

	public void inputData() {
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("이름 : ");
//		name = scan.nextLine();
//		this.name = name;
		
		System.out.print("\n중간점수 : ");
		String midString = scan.nextLine();
		this.midScore = Integer.parseInt(midString);
		
		System.out.print("기말점수 : ");
		String finString = scan.nextLine();
		this.finScore = Integer.parseInt(finString);
	}
	
	// 상위 클래스 재정의 = override..
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + "(중간고사" + this.midScore + ", 기말고사 "+ this.finScore + ")";
	}

}
