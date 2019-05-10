// 실패

import java.math.BigInteger;
import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class MBox2 {
	private int coin = 0;
	public String message = null;
	
	int inputcoin;

	public void deposit() {
		
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("\n입금할 금액을 입력하세요. 필요하다면 메세지를 같이 입력하세요.\n종료시 crash를 입력하세요.");
			this.inputcoin = scan.nextInt();
			this.message = scan.nextLine();
			this.coin = this.coin + this.inputcoin;
			
			String ipcoin = Integer.toString(this.inputcoin);
			if (message.equals("")) {
				System.out.println(inputcoin + "딸그랑");
			} else if (message != "") {
				System.out.println(inputcoin + message);
			} else {
				System.out.println(this.coin + "시스템이 종료됩니다.");
				break;
		}

	}
	}
}

	

	
	
	
	


