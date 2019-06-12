import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
		Player player = new Player();
		Enemy e1 = new Enemy();
		player.hp = 100;
		e1.hp = 100;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("턴 진행은 엔터를 입력하세요.");
		for (int i = 0; i < 10000; i++) {
			scanner.nextLine();
			
			e1.beUnderAttak();
			if (e1.status()) {
				
			} else {
				System.out.println("적이 파괴되었습니다. 플레이어의 승리입니다.");
				break;
			}
			
			player.beUnderAttak();
			if (player.status()) {
				
			} else {
				System.out.println("당신은 졌습니다.");
			}
		}
	}
}
