import java.util.Random;
import java.util.Scanner;

public class Array5 {
	public static void main(String[] args) {
		int total = 0;
		int evenTotal = 0;
		int oddTotal = 0;
		
//		Object r = new Random();
//		r.nextInt();
//		
		for (int i = 0 ; i < 100; i++) {
			int number  = i + 1;
			total = total + number;
			
			int even = 0;
			int odd = 0;
			
			if (number % 2 == 0) {
				even = number;
				odd = 0;
			}
			evenTotal = evenTotal + even;
			oddTotal = total - evenTotal;
		}
	}

}

