import java.util.Random;

public class DiceGame {
	public static void main(String[] args) {
		
	Random rdice = new Random();
	int dice = rdice.nextInt(6);
	int dice2 = dice + 1;
		
//	if (dice2 == 1) System.out.println("港港");
//	else if (dice2 ==2) System.out.println("具克");
//	else if (dice2 ==3) System.out.println("3");
//	else if (dice2 ==4) System.out.println("4");
//	else if (dice2 ==5) System.out.println("5");
//	else System.out.println("6");
	
	switch (dice2) {
	case 1 : System.out.println("港港"); break;
	case 2 : System.out.println("具克"); break;
	case 3 : System.out.println("3"); break;
	case 4 : System.out.println("4"); break;
	case 5 : System.out.println("5"); break;
	default : System.out.println("6");
	}
}
}
