import java.util.Calendar;

public class API_01 {
	public static void main(String[] args) {
		// 객체 생성을 최소화하는 string클래스
		StringBuffer s = new StringBuffer("Hello");
		System.out.println(s);
		s.append("world");
		System.out.println(s);
		
		//
		System.out.println(System.currentTimeMillis());
		
		// 현재 날짜와 시간 정보를 가진 Calendar 객체를 생성
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		// 0부터 1 미만의 랜덤 실수값 발생
		double randNum = Math.random();
		System.out.println(randNum);
		// 소수자리 내림
		double choice = Math.floor(randNum * 5);
		System.out.println(choice);
		
		// 기본자료형을 객체데이터 형태로 쓰기 (Wrapping)
		Integer a = new Integer(10);
		System.out.println(a.getClass());
		int b = a;
		System.out.println(b);
//		System.out.println(b.getClass());
		
		// import 없이 random 사용 가능.
		// 같은 이름의 클래스가 두 개 이상일 경우 섞어쓰기 가능 (Date처럼 package가 두 개 이상인 경우)
		java.util.Random rand = new java.util.Random();
	}
}
