// 총합 구하기 다른 방법 2~

public class TotalNumber3 {
	public static void main(String[] args) {
		int total = 0;
		int evenTotal = 0;
		int oddTotal = 0;
		
		for (int i = 0; i < 100; i++) {
			int number = i + 1;
			total = total + number;
			
			int evenNumber = number;
			int oddNumber = 0;
						
			if (number % 2 == 0) {
				evenNumber = number;
				oddNumber = 0;
			}
			evenTotal = evenTotal + evenNumber;
			oddTotal = total - evenTotal;
		}
		System.out.println("총합은 " + total);
		System.out.println("짝수 총합은 " + evenTotal);
		System.out.println("홀수 총합은 " + oddTotal);
	}
}