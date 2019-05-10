
public class MBox {
	public int totalCoin;
	public String name;
	private String name2; // 프라이빗은 외부수정불가. 내부에서만 접근가능. 외부에서는 메소드만을 통해 가능.
	
	public void setName(String name) {
		this.name = name;
		//메소드 접근(=속성 접근) 메소드 속성변수 이름과 입력값 이름을 동일하게 만들기 위함
		//this. = 메소드 자체의 property(속성값) 접근 이라는 표시
	}
	
	public void deposit(int inputCoin) {
		this.totalCoin = this.totalCoin + inputCoin;
		System.out.println(name + "잔액 : " + this.totalCoin);
	}
	
	public void withdraw(int outCoin) {
		System.out.println(name + "출금액 : " + outCoin + " / 잔액 : "+(this.totalCoin-outCoin));
		totalCoin = 0;
	}
	
}

//public class RunClass {
//	public static void main(String[] args) {
//		MBox box1 = new MBox();
//		
//		box1.deposit(100);
//	}
//}