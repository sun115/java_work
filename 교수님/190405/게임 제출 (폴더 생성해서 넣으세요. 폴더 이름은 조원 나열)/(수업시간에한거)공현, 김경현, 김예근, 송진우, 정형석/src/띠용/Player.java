package 띠용;
import java.util.Random;

public class Player {
	String name = "";
	int HP = 0;

	Player(String name, int HP) {
		this.name = name;
		this.HP = HP;
	}

	public boolean status() {
		if (HP > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void attack() {
		Random R = new Random();
		int A = R.nextInt(51)+1;
		int E = R.nextInt(51)+1;
		int r = A-E;
		
		if(r > 0) {
			System.out.println(this.name+"이(가)"+r+"만큼 피해를 받았습니다.");
			HP = HP - r;
		}else if(r <= 0) {
			System.out.println(this.name+"이(가) 회피에 성공했습니다.");
		}
	}
	
//	public void Heal() {
//		this.HP = this.HP + 100;
//		System.out.println(this.name+"의"+"HP가 100회복 되었습니다. 현재 HP : " + this.HP);
//	}

}
