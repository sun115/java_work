import java.util.Random;

public class Enemy{
	String name = " ";
	int hp = 0;
	int att = 0;
	int defen = 0; 
	//생성자
	Enemy(String name, int hp, int defen){
		this.name = name;
		this.hp = hp;
		this.defen = defen;
	}

	public boolean status() {
		if (hp > 0 ) {
			return true;
		}
		return false;
	}
	
	public void beUnderattack() {
		Random random = new Random();
		int hitNumber = random.nextInt(3);
		
		if (hitNumber == 1) {
			this.hp = hp - (10 - this.defen);
			System.out.println(this.name + "이(가) " + (10 - this.defen) + "의 데미지를 입었습니다.");
		} else {
			System.out.println(this.name + "이(가) 공격을 회피했습니다.");
		}
	}
}
