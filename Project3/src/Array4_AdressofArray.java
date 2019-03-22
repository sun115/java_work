import java.util.Scanner;

public class Array4_AdressofArray {
	public static void main(String[] args) {
		String a = "hi";
		String b = "hi";
		Scanner adress = new Scanner(System.in);
		String c = adress.nextLine();
		
		System.out.println(a == b);
		System.out.println();
		
		System.out.println(a.equals(b));
		System.out.println(a == c);
		System.out.println();
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
	}
}

// 문자열은 다른 변수에 같은 값이 입력됐을 때에 같은 주소에 저장됨.
// 그러나 스캐너로 입력받았을 경우 입력받은 곳이 다르므로 다른 주소에 저장됨.
