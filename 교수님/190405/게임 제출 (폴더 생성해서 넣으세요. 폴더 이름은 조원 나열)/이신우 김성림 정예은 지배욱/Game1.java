import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사용자의 이름을 입력하세요.");
		String userName = scan.nextLine();
		
		Player player = new Player(userName, 100, 5); // scan 스캔
		Enemy[] enemy = new Enemy[3];
		enemy[0] = new Enemy("Java", 60, 3);
		enemy[1] = new Enemy("Python", 40, 3);
		enemy[2] = new Enemy("DB", 20, 3);
		
		System.out.println("엔터를 입력하세요.");
		for (int i = 0; i < 10000; i++) {
			scan.nextLine();
			
			for (int j = 0; j < enemy.length; j++) {
				if (enemy[j].status()) {
					enemy[j].beUnderattack();
				}
			}
			
			boolean nonDefeat = false;
			for (int j = 0; j < enemy.length; j++) {
				if (enemy[j].status()) {
					nonDefeat = true;
				}	
			}
			
			player.beUnderattack();
			if (player.status()) {
				
			} else {
				System.out.println("당신은 졌습니다.");
				break;
			}
			
			if (!nonDefeat) {
				System.out.println("적이 전멸하였습니다." + player.name + "의 승리입니다.");
				System.out.println(player.name + " 남은체력 : " + player.hp);
				break;
			}
			
		}
	}
}
