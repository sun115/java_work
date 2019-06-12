import java.util.Random;

public class Player {
	String name = "";
	int hp = 0;
	int defense = 30;  //방어력을 추가하여 준다.
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
		Random r = new Random(1000); 
		int attackPower = r.nextInt(); 
		return attackPower;
		
	}
	public void beUnderAttak(int attackPower,int healingPotion) {
		
		Random random = new Random();
		int hitNumber = random.nextInt(10);

				
		if (hitNumber == 1) {
				if (attackPower - defense < 0) { //방어력을 셈하여 공격값을 계산한다.
					attackPower = 0 - healingPotion;
				}else {
					attackPower = attackPower - defense - healingPotion; // 방어력과 힐링값을 셈하여 공격값을 계산한다.
				}
			hp = hp - attackPower;
			System.out.println(this.name + "이(가) " + attackPower*10000 + "의 데미지를 입었습니다.");
			// 겉보기에는 값을 크게 준다.
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
		
		
		
	}
}
