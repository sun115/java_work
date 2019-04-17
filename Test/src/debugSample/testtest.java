package debugSample;

public class testtest {
	public static void main(String[] args) {
		// 1. define array
		double[] array = {1,2,3,4,5,6,11,22};
		
		// 2. Call sum array
		double answer = sum(array);
		System.out.println("합계: " + answer);
	}

	private static double sum(double[] array) {
		// TODO Auto-generated method stub
		double sum = 0.0;
		
		// Iteration for array value
		for (int i=0; i<array.length; i++) {
			sum += array[i];
		}
		//return value
		return sum;
		
	}

}
