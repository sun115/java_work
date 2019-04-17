import java.util.Random;

public class Player {
	String name = "";
	int hp = 0;
	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;
	}
	public void beUnderAttak() {
		Random random = new Random();
		int hitNumber = random.nextInt(100);
		if (hitNumber == 99) {
			hp = hp - 10;
			System.out.println("플레이어가 10의 데미지를 입었습니다.");
		} else {
			System.out.println("플레이어가 회피했습니다.");
		}
	}
}
