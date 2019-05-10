// Object 2
public class Obj { // extends Object 는 디폴트, 생략된 것.
	public static void main(String[] args) {
		Obj2 a = new Obj2();
		Object b = new Obj2();
		
		a.name = 124;
		
		Object c = new Object();
		c=123;
		
		System.out.println(".equals 결과 : " + a.equals(b));
		System.out.println("a.toString 결과 : " + a.toString());
		System.out.println("a 결과 : " + a);
		System.out.println("b.toString 결과 : " + b.toString());
		System.out.println("b 결과 : " + b);
		
		System.out.println("c.equals 결과 : " + c.equals(a));
		System.out.println("c.toString 결과 : " + c.toString());
		System.out.println("c 결과 : " + c);
	}

}
