import java.util.Random;

public class Enemy {
	String name = "";
	int hp = 0;

	//생성자
	Enemy(String name,int hp){
		this.name = name;
		this.hp = hp;
		
	}
	public boolean status() {
		if(hp > 0) {
			return true;
		}
		return false;
	}

	public void attacked(int dR) {
		Random random  = new Random();
		int hitNumner = random.nextInt(10);
		Player player = new Player();
		if (hitNumner == 5) {
			hp = hp - dR;
			System.out.println(this.name +"이(가)" + dR +"의 데미지를 입었습니다. ");
		}else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
