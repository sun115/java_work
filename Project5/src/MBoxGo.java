
public class MBoxGo {
	public static void main(String[] args) {
		MBox box1 = new MBox();
		MBox box2 = new MBox();
		
		
		
		box1.setName("돼지저금통");
		box2.setName("서랍형");
		
		box1.deposit(1000);
		box1.deposit(100);
		box2.deposit(3000);
		
//		box1.withdraw();
		box1.deposit(200);
		
		box1.withdraw(120);
		box2.withdraw(160);
		
//		System.out.println(box1.totalCoin);
//		System.out.println(box2.totalCoin);

	}

}
