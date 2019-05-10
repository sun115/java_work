//Object 2
public class Obj2 {
	int name = 1;
	Obj2(){
		System.out.println("안녕하세요");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString(); //super-부모의 것.
		return "SDFDS";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Obj2 obj2 = (Obj2)obj; // 특정 변수와 비교하기 위한 ^타입 캐스팅^
		if (this.name == obj2.name) {
			return true;
		}
		//return super.equals(obj);
		return false;
	}
}
