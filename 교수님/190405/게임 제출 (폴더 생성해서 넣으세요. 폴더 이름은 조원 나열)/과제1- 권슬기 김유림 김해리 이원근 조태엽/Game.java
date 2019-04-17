import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		// 적은 하나라는 전제
		// 여러 적 만들기 위한 배열생성
		Enemy[] enemy = new Enemy[5];
		enemy[0] = new Enemy("자바", 100);//타입 변환가능
		enemy[1] = new Enemy("뚜비", 100);
		enemy[2] = new Enemy("뽀", 100);
		enemy[3] = new Enemy("보라돌이", 100);
		enemy[4] = new Enemy("나나", 100);
		
		Player[] player = new Player[2];
		player[0] = new Player("피카추",100,25);
		player[1] = new Player("아구몬",100,10);

		// 루프부분, 엔터 누르면 턴이 넘어간다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("턴 진행은 엔터를 입력하세요.");
		for (int i = 0; i < 10000; i++) {
			scanner.nextLine();
			// 엔터 입력 받는부분.
			// 돌아가면서 공격하기 위한 부분 살아있는애한테만
			for (int h = 0; h < player.length ; h++) {
				for (int j = 0; j < enemy.length; j++) {
					int dR = player[h].damageReturn();
					if (enemy[j].status()) {
						enemy[j].attacked(dR);
			// !!!!!! 적에게 플레이어 설정 값에 따라 데미지를 다르게 주기 위해 만들었습니다.!!!!!
					}
			}
			// 살아있는 아이가 있으면 nonDefeat 을 true 로
			boolean nonDefeat = false;
			for (int j = 0; j < enemy.length; j++) {
				if (enemy[j].status()) {
					nonDefeat = true;
				}
			}

			for(int k = 0; k <player.length; k++) {
				if (player[k].status()) {
					player[k].attacked();
			
			} else {
				System.out.println("당신은 졌습니다. ");
			}
			if (!nonDefeat) {
				System.out.println("적이 파괴되었습니다. 플레이어의 승리입니다.");
				break;
			}


		}
	}
}
	}
}

