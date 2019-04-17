import java.util.Random;

public class Rand2 extends Random {
//	@Override
	public int[] nextInt2 (int range) {  //부모class와 같은 메소드인 nextInt를 사용할 땐 override.
		int newRandNum = 0;
		int[] RNlist = new int[10];
		for (int i = 0; i < RNlist.length; i++) {
			newRandNum = super.nextInt(range) + 100;
			RNlist[i] = newRandNum;
		}
		return RNlist;
	}
}
