import java.util.Scanner;

public class Student4GoGo {
	public static void main(String[] args) {
		
//		int stunum;
//		System.out.print("학생 수 : ");
//		Scanner scan = new Scanner(System.in);
//		stunum = scan.nextInt();
//		
		Student4 arr = new Student4();
		
		for (int i=0; i<3; i++) {
			arr = new Student4((i+1) + "번 학생");
			arr.inputData();
		}
		
		for (int i=0; i<3; i++) {
			System.out.println(arr);
		}
	
	}

}
