import java.util.Arrays;

public class Rand {
	public static void main(String[] args) {
		Rand2 rand = new Rand2();
		int[] arr2 = rand.nextInt2(100);
		System.out.println(Arrays.toString(arr2));
	}
}
