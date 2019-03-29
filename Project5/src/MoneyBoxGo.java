import java.util.Scanner;


public class MoneyBoxGo {
	public static void main(String[] args) {
		MoneyBox box1 = new MoneyBox();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i<99999; i++) {
			System.out.print("메뉴 선택 1.입금, 2.입금+메세지, 3.종료 : ");
			System.out.print("입금할 금액 : ");
			int coin = scanner.nextInt();
			
			System.out.print("메세지 : ");
			String message = scanner.nextLine();
			
			box1.deposit(coin,message);
			if(message.equals("crash")) {
				break;
			}
		}
	}
}
