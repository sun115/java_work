import java.util.Random;

public class Player {
	String name = "";
	int hp = 0;
	Player(String name, int hp) {
		this.hp = hp;
		this.name = name;
	}
	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;
	}
	public int getAttackPower() {
		return 10;
	}
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(2);
		if (hitNumber == 1) {
			hp = hp + attackPower;
			System.out.println("낄낄ㅋ ㅋ " + attackPower + "의 데미지를 흡수했습니다. 현재 체력은^^~? " + hp + "이라능^-^");
		} else {
			System.out.println("그치만...뀨^^ㅗ");
		}
	}
}
