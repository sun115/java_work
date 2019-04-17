import java.util.Random;

public class Player {
	String name = "";
	int hp = 0;
	int damage;
	//생성자
	Player(String name,int hp,int damage){
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	Player(){
		
	}

	// 살아있다 - true
	public boolean status() {
		if (hp > 0) {
			return true;
		}
		return false;
	}

	public void attacked() {
		Random random = new Random();
		int hitNumber = random.nextInt(100); //1퍼센트 확률로 공격받음
		if(hitNumber == 1 ) {
			hp = hp - 10;
			System.out.println(this.name +"이(가) 10의 데미지를 입었습니다. ");
		}else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	
	}
	
	public int damageReturn() {
		return this.damage;
	}
	
}
