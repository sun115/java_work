
public class Practice_calculate {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 3;
		boolean c;
		boolean d;
		boolean e;
		
		c = a != b; 
		// c = (a와 b가 다른가? yes=true, no=false)
		System.out.println(c);
		
		d = (a != b) && (a > b);
		// d = (a와b가 다른가?) 그리고 (a는b보다 큰가?) both yes=true, 하나라도 no=false
		System.out.println(d);
		
		if (a < b) {
			System.out.println(a + "이(가) " + b + "보다 작다.");
		} else if (a == b) {
			System.out.println(a + "와 " + b + "는 같다.");
		} else {
			System.out.println(a + "이(가) " + b + "보다 크다.");
		}
		
	}
	
	
}