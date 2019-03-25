

public class SumMachine {
	public void makeMul(int startVal, int endVal) {
		int start = startVal;
		int end = endVal;
		int mul = 0;
		
//		for (int i = 0; i <= end; i++) {
			mul = start * end;
//		} // end for
		
		System.out.println("\n시작값 : " + start);
		System.out.println("종료값 : " + end);
		System.out.println("곱한 값 : " + mul);
	}

	public static void main(String[] args) {
		SumMachine m = new SumMachine();
		m.makeMul(1, 1000);
		m.makeMul(20, 200);
		m.makeMul(8984, 2939);
	}
}
