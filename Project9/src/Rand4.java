import java.util.Random;

public class Rand4 extends Random{
	int[] resultArr = new int[10];
	public void nextInt2(int range) {
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = super.nextInt(range);
		}
	}

}
