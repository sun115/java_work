import java.util.Scanner;

public class MBox2 {
	private int coin = 0;
	public String name;
	Scanner scan = new Scanner(System.in);
	int inputcoin = scan.nextInt();
//	String message = scan.nextLine();
	
//	@SuppressWarnings("unused")
	public void deposit(int inputcoin) {
		
	}
	public void deposit(int coin, String message) {
		
		while (true) {
			System.out.println("입금할 금액을 입력하세요.\n필요하다면 메세지를 같이 입력하세요.");
			int inputcoin = scan.nextInt();
			String message = scan.nextLine();
			this.coin = this.coin + inputcoin;
			
			if (message != null) {
				System.out.println(inputcoin + message);
			} else if (message.equals("crash")) {
				System.out.println(this.coin + "시스템이 종료됩니다.");
				break;
			} else if (message.equals(null)) {
				System.out.println(inputcoin + "딸그랑");
			}
		}

	}
}
	
	
	
	
//	public void deposit1(int inputCoin) {
//		this.totalCoin = inputCoin;
//		System.err.println("딸그랑");
//	}
//	
//	public void deposit2(String name, int inputCoin) {
//		this.name = name;
//		this.totalCoin = inputCoin;
//	}
//	public void bye(String name) {
//		this.name = "crash";
//		System.out.println("총 액수 : " + totalCoin);
//		totalCoin = 0;
//		System.out.println("프로그램을 종료합니다.");
//	}
	


