import java.util.Random;

public class Enemy {
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
		int hitNumber = random.nextInt(10);
		if (hitNumber == 5) {
			hp = hp - 10;
			System.out.println("적이 10의 피해를 입었습니다.");
		} else {
			System.out.println("적이 회피했습니다.");
		}
	}
}
