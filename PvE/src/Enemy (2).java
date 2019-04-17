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
		System.out.println(this.name + "이 죽어벌였읍니다ㅋ");
		return false;
	}
	
	public int getAttackPower() {
		// 마비당했을 때 공격력 상실
		if (hp==100000) {
			return 0;
		}
		return 10;
	}	
	
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(10);
		if (hitNumber <= 3) {
			hp = hp - attackPower;
			System.out.println(this.name + "이(가) " + attackPower + "의 피해를 입었습니다.");
		} 
		else if (hitNumber == 2) {
			System.out.println("플레이어에게 공격당한  적이 마비되었습니다.\n" + this.name + "은 모든 공격력을 상실합니다.");
			hp = 100000;  // 공격력 함수와 이어지게 하려는 요소로 hp 아무거나 지정함
		}
		else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
	
	public void paralized () {
		Random random = new Random();
		int prNumber = random.nextInt(5);
	}
}
