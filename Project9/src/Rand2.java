
import java.util.Random;
import java.util.Scanner;

public class Rand2 extends Random {
//	@Override  //부모class와 같은 메소드인 nextInt를 사용할 땐 override.
	public int[] nextInt2 (int range) {
		int newRandNum = 0;
		System.out.println("몇 개의 숫자를 원하심닉아");
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		int[] RNlist = new int[inputNum];
		
		for (int i = 0; i < RNlist.length; i++) {
			newRandNum = super.nextInt(range) + 100;		//100이상의 숫자만 출력되도록
			RNlist[i] = newRandNum;
		}
		return RNlist;
	}
}
