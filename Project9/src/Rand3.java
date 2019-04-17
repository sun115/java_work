import java.util.Arrays;

public class Rand3 {
	public static void main(String[] args) {
		Rand4 rand = new Rand4();
		rand.nextInt2(100);
		System.out.println(Arrays.toString(rand.resultArr));
		double n2 = rand.nextDouble();
	}

}
