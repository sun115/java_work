import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
		//폴리텍이라는 이름을 넣고 hp에 100 넣음
		
		Player player = new Player("폴리텍", 100);
		Enemy[] enemy = new Enemy[5];
		enemy[0] = new Enemy("자바", 100);
		enemy[1] = new Enemy("자동차", 10);
		enemy[2] = new Enemy("나비", 90);
		enemy[3] = new Enemy("잠자리", 120);
		enemy[4] = new Enemy("참새", 200);

		Scanner scanner = new Scanner(System.in);
		System.out.println("턴 진행은 엔터를 입력하세요.");
		//적이 돌아가면서 공격을 해야하게 때무넹
		for (int i = 0; i < 10000; i++) {
			scanner.nextLine();

			for (int j = 0; j < enemy.length; j++) {
				if (enemy[j].status()) {
					enemy[j].beUnderAttak();
				}
			}

			boolean nonDefeat = false;
			for (int j = 0; j < enemy.length; j++) {
				if (enemy[j].status()) {
					nonDefeat = true;
				}
			}
			if (!nonDefeat) {
				System.out.println("적이 전멸하였습니다. 플레이어의 승리입니다.");
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
