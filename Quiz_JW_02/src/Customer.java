import java.util.Random;
import java.util.Scanner;

public class Customer extends Clothes{
	Customer[] customer = new Customer[10];
	String name;
	String type;
	String size;
	int pay = 0;
	
	public Customer[] ctInfo() {
		String[] names = {"1번", "2번", "3번", "4번", "5번", "6번", "7번", "8번", "9번", "10번"};
		String[] types = {"top", "bottom", "outer", "underwear"};
		String[] sizes = {"S", "M", "L"};
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int tmp;
		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer();
//			System.out.println("고객 10명의 이름을 입력하세요.");
			customer[i].name = names[i];
			tmp = rand.nextInt(4);
			customer[i].type = types[tmp];
			tmp = rand.nextInt(3);
			customer[i].size = sizes[tmp];
		}
		
		return customer;	
	}
	
	public void payment() {
		ctInfo();
		// 옷 구경
		Clothes clt = new Clothes();
		clt.clInfo();
//		Customer[] clothes = (Customer[])clt.clothes;
		
//		while(true) {
			for (int i = 0; i < customer.length; i++) {
				for (int j = 0; j < clothes.length; j++) {
					if(customer[i].type.equals(clothes[j].type)) {
						if(customer[i].size.equals(clothes[j].size)) {
							customer[i].pay += clothes[j].price;
						}
					}
				}
				
			}
		}
	
	
	public String print() {
		
		return "이름: " + name + " ||| 사이즈: " + size + " 지불가격: " + this.pay;
	}
	
	
	
	
}
