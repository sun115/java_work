import java.util.Random;
import java.util.Scanner;

// 한글로 답을 입력해도 돌아가도록 해 보자!

public class RCP_test {
	public static void main(String[] args) {
		
		Scanner inputFromUser = new Scanner(System.in);
		System.out.println("가위, 바위, 보 중에 선택하세요.");
		
		Random caseCom = new Random();
		int computerChoice = caseCom.nextInt(3);
		
		String inputText = inputFromUser.nextLine();
		if(inputText.equals("가위")) {
			
			}
	
}
}