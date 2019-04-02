
public class Quiz1 {
	public String name;
	int korScore;
	int engScore;
	int mathScore;
//	public int total = korScore + engScore + mathScore;
	public static double total(double[] array) {
	    double sum = 0.0;
	    for (int i = 0; i < array.length; i++)
	      sum += array[i];

	    return sum;
	  }
//	public double average = (korScore + engScore + mathScore) / 3;
	public static double average(double[] array) {
	    double sum = 0.0;
	    for (int i = 0; i < array.length; i++)
	      sum += array[i];

	    return sum / array.length;
	  }

	
}
