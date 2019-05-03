import java.util.Scanner;

public class Run369_Obj {
	public static void main(String[] args) {
		
		String[] players = new String[4];
		System.out.println("플레이어 이름을 입력하세요");
		for (int i = 0; i < args.length; i++) {
			for (int i = 0; i < players.length; i++) {
				System.out.print((i+1)+"번째 플레이어 : ");
				players[i] = scan.nextLine();
			}	
		}
		
		
		Game369_Obj play = new Game369_Obj();
		play.do369();
	}

}
