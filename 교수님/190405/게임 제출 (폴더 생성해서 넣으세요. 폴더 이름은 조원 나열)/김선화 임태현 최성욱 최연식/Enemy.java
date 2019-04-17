import java.util.Random;

public class Enemy {
	String name = "";
	int hp = 0;
	Enemy(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;
	}
	
	public void beUnderAttak() {
		Random random = new Random();
		int hitNumber = random.nextInt(5);
		if (hitNumber == 3) {
			hp = hp - 10;
			System.out.println(this.name + "이(가) 10의 피해를 입었습니다.");
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
