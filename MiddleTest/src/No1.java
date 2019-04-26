//	1부터 1000까지 5의 배수의 합을 구하시오.
//	(제약 없음)

public class No1 {
	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i = 1; i <= 1000; i++) {
			int num = 0;
			if(i%5==0) {
				num=i;
				sum += num;
				System.out.print(num + " ");
			}			
		}
		System.out.println("\n5의 배수의 합은? " + sum);
	}
}
