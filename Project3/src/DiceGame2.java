import java.util.Random;
import java.util.Scanner;


public class DiceGame2 {
	public static void main(String[] args) {
		int comDice = 0;
		int userDice = 0;
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
		System.out.println("\n\n사용자의 주사위를 굴릴까요?");
		scan.nextLine();
		
		userDice = rand.nextInt(6) + 1;
		System.out.println("사용자의 주사위 숫자는 " + userDice + "입니다.");
		
		System.out.println("\n\n컴퓨터의 주사위를 굴릴까요?");
		scan.nextLine();
		
		comDice = rand.nextInt(6) + 1;
		System.out.println("컴퓨터의 주사위 숫자는 " + comDice + "입니다.");
		
		if (comDice == userDice) {
			System.out.println("\nDRAW");
		} else if (comDice > userDice) {
			System.out.println("\nLOSE");
		} else {
			System.out.println("\nWIN");
		}
		}
	}
}