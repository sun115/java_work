
public class MyProject {
	public static void main(String[] args) {
		
		int a = 666666;
		short b = 3;
		b = (short)a;
		System.out.println(b);
		
		short c = 10;
		int d;
		d= c;
		System.out.println(c);
		
		int number1 = 10;
		int number2 = 3;
		double resultNumber = (double)number1 / (double)number2;
		// 나누기 연산은 분모 분자 중 한쪽만 실 수 처리해도 실 수로 연산됨.
		System.out.println(resultNumber);
		
		int e = 10;
		System.out.println(e++);
		// 일단 e를 print하고 e의 값을 1up
		System.out.println(++e);
		// 1up한 e(11) 에서 다시 1up한 값을 print
		
		// 좀 더 정확하게 코딩하기
		int f = 10;
		f++;
		System.out.println(f);
		++f;
		System.out.println(f);
		
		
		
	}

}
