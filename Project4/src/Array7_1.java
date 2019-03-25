
public class Array7_1 {
	public void doMake(int stt, int end) {
		int total = 0;
		for (int i = stt; i < end +1; i++) {
			total = total + i;
		}
		System.out.println("시작값  : " + stt);
		System.out.println("종료값 : " + end);
		System.out.println("범위 합계  : " + total);
	}

}
