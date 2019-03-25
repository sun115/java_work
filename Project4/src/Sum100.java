// 1부터 100까지의 총 합 구하기.
// 클래스 - 메소드 방식으로

public class Sum100 {
	public void sum100 () {
		int sum = 0;
		for(int i = 0; i<101; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 총 합은 : " + sum);
	}
	public static void main(String[] args) {
		Sum100 total = new Sum100();
		total.sum100();
		
	}
}
