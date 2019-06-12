import java.util.Random;

public class Player {
	String name = "";
	int hp = 0;
	
	
	// 플레이어 정보 설정
	Player(String name, int hp) {
		this.hp = hp;
		this.name = name;
		
	}
	
	// 플레이어 생사 설정
	public boolean status() {
		if (hp > 0) {
			return true;
		} 
		// ★★★★★★★★★ 추가 속성 ★★★★★★★★★
		// hp가 음수가 될 때 좀비로 변신, 공격에 맞으면 자신의 공격력 증폭
		else if (hp == 0) {
			System.out.println("\n※ SYSTEM WARNING ※\n주의하세요! " + this.name + "이 좀비가 되었습니다.\n좀비를 공격한다면 무~서~운 일이 일어납니다.\n" + this.name + " : 으어어ㅓ어,,,\n");
		
			
			this.name = "좀비 " + this.name;
			return true;
		}
		System.out.println(this.name + "이 죽었습니다ㅠ");
		return true;
	}
	
	// 플레이어 공격력 설정
	public int getAttackPower() {
		if (hp < 0) {
			return 99999;
		}
		return 10;
	}
	
	// 플레이어 회피확률 설정
	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(10);
		
		// 좀비가 되었을 때에는 무조건 공격에 맞게 함. (좀비 변신 경고문이 중복으로 뜨지 않게 하기 위함)
		if(hp==0) {
			if (hitNumber < 11) {
				System.out.println("좀비가 공격받았습니다. 좀비의 공격력이 상습합니다.");
				hp = hp - attackPower;
			}
		}
		
		if (hitNumber == 1) {
			hp = hp - attackPower;
			System.out.println(this.name + "이(가) " + attackPower + "의 데미지를 입었습니다.");
		} else {
			System.out.println(this.name + "이(가) 회피했습니다.");
		}
	}
}
