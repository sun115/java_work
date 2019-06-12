import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
		
		Player player = new Player("동지형성", 100000, 10000, 10, 150, 50); //(이름, 체력, 공격력, 크리확률, 크리데미지, 회피율)
		Enemy[] enemy = new Enemy[3];
		enemy[0] = new Enemy("과제", 10, 5, 10, 120, 10);
		enemy[1] = new Enemy("시험", 10, 5, 10, 120, 10);
		enemy[2] = new Enemy("퀴즈", 10, 5, 10, 120, 10);
		HealthPointCalculation hpcalc = new HealthPointCalculation();
		Attack attack = new Attack();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("턴 진행은 엔터를 입력하세요.");
		for (int i = 0; i < 10000; i++) {
			
			scanner.nextLine();
			
			for (int j = 0; j <enemy.length; j++) {
				if(enemy[j].hp > 0) {
					attack.attack(enemy[j].avoidProbability, enemy[j].criProbabilty, enemy[j].strength, enemy[j].criDamage);
					System.out.println(enemy[j].name + "의 공격");
					if (attack.avoidActive) {
						System.out.println(player.name + "이(가) " + enemy[j].name + "의 공격을 회피하였다!");
					} else {
						player.hp = player.hp - attack.damage;
						if (attack.criticalActive) {
							System.out.println(player.name + "는 " + attack.damage + "만큼의 치명적인 피해를 입었다!");
						} else {
							System.out.println(player.name + "는 " + attack.damage + "만큼의 피해를 입었다!");
						}
					}
					
				}
			}
			
			boolean nonDefeat = false;
			for (int j = 0; j <enemy.length; j++) {
				if(enemy[j].hp > 0) {
					nonDefeat = true;
				}
			}
			
			if (!nonDefeat) {
				System.out.println("모든 적 전멸, 당신의 승리.");
				break;
			}
			
			if (player.hp > 0) {
				System.out.println("\r\n공격을 위해 숫자를 입력하세요.");
				int temp = Integer.parseInt(scanner.nextLine());
				attack.attack(player.avoidProbability, player.criProbabilty, player.strength, player.criDamage);
				System.out.println(player.name + "의 공격");
				if (attack.avoidActive) {
					System.out.println(enemy[temp].name + "이(가) " + player.name + "의 공격을 회피하였다!");
				} else {
					enemy[temp].hp = enemy[temp].hp - attack.damage;
					if (attack.criticalActive) {
						System.out.println(enemy[temp].name + "는 " + attack.damage + "만큼의 치명적인 피해를 입었다!");
					} else {
						System.out.println(enemy[temp].name + "는 " + attack.damage + "만큼의 피해를 입었다!");
					}
				}
			} else {
				System.out.println("죽었습니다. 패배..");
				break;
			}
		}
	}
}
