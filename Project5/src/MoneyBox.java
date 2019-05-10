import java.util.Scanner;


public class MoneyBox {
	private int coin;
	
	Scanner scan = new Scanner(System.in);
	
	public void deposit() {
		System.out.println("입금할 금액을 입력하세요.");
		int coin = scan.nextInt();
		this.coin = this.coin + coin;
		System.out.printf("잔액: %d, 비고: 땡그랑\n", this.coin);
	}
	
	public void deposit2() {
		System.out.println("입금할 금액과 메세지를 입력하세요.");
		int coin = scan.nextInt();
		String message = scan.nextLine();
		this.coin = this.coin + coin;
		System.out.printf("잔액: %d, 비고: %s\n", this.coin, message);
	}
	
	public void crash() {
		System.out.println("전체 코인 " + coin + "원이 출금되었습니다.\n프로그램을 종료합니다.");
		this.coin = 0;
	}


}
