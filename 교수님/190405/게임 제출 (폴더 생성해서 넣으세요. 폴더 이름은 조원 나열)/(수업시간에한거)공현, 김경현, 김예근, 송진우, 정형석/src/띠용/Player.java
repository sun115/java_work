package ���;
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
			System.out.println(this.name+"��(��)"+r+"��ŭ ���ظ� �޾ҽ��ϴ�.");
			HP = HP - r;
		}else if(r <= 0) {
			System.out.println(this.name+"��(��) ȸ�ǿ� �����߽��ϴ�.");
		}
	}
	
//	public void Heal() {
//		this.HP = this.HP + 100;
//		System.out.println(this.name+"��"+"HP�� 100ȸ�� �Ǿ����ϴ�. ���� HP : " + this.HP);
//	}

}
