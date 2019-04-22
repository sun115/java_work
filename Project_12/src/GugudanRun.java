import java.io.IOException;
import java.util.Scanner;

public class GugudanRun {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("몇 단을 출력할까요?");
//		String tmpStr = scan.nextLine();
//		Integer inputInt = new Integer(tmpStr);
//		int inputInt = Integer.parseInt(tmpStr);
		
		// 서브클래스 메소드에 try catch 사용했을 때 - default로 권장
//		Gugudan gugu = new Gugudan();
//		gugu.gugu();
		
		// 서브클래스에 throws Exception 했을 때  - 예외처리를 모아서 해야 할 경우
		Gugudan2 gugu2 = new Gugudan2();
		try {
			gugu2.gugu();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		// 메인에 throws Exception 했을 때 - 강제 예외처리가 필요할 경우
//		Gugudan2 gugu2 = new Gugudan2();
//		gugu2.gugu();
		
		
		// ???????? 어쩌라고 ? .... 자동생성되는거 보라고,,
		java.io.File file = new java.io.File("C:\\file.txt");
		try {
			file.getCanonicalFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
	}

}
