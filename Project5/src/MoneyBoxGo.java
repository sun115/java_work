import java.util.Scanner;


public class MoneyBoxGo {
	public static void main(String[] args) {
		MoneyBox box1 = new MoneyBox();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("\n메뉴 선택 1.입금, 2.입금+메세지\n종료하려면 'crash' 입력\n");
			String inputMessage = scanner.nextLine();

			if(inputMessage.equals("1")) {
				box1.deposit();
			} else if (inputMessage.equals("2")) {
				box1.deposit2();
			} else if (inputMessage.equals("crash")) {
				box1.crash();
				break;
			}
		}
	}
}
