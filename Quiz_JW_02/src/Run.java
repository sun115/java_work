import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		Clothes store = new Customer();
		store.clInfo();
		((Customer) store).ctInfo();
		((Customer) store).payment();
//		
		int len = ((Customer) store).customer.length;
		int len2 = store.clothes.length;
		
		for (int j = 0; j < len; j++) {
			System.out.println(((Customer) store).customer[j].print());
		}
		System.out.println("\n\n");
		for (int i = 0; i < len2; i++) {
			System.out.println(store.clothes[i].print2());
		}
	}

}
