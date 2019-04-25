import java.util.Random;
import java.util.Scanner;

public class Clothes{
	Clothes[] clothes = new Clothes[40];
	String type;
	String size;
	int price;
	
	public Clothes[] clInfo() {
		
		String[] types = {"top", "bottom", "outer", "underwear"};
		String[] sizes = {"S", "M", "L"};
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int tmp;
		for (int i = 0; i < clothes.length; i++) {
			clothes[i] = new Clothes();
			tmp = rand.nextInt(4);
			clothes[i].type = types[tmp];
			tmp = rand.nextInt(3);
			clothes[i].size = sizes[tmp];
			clothes[i].price = (rand.nextInt(481)+10)*100;
		}
		
		return clothes;
	}
	
	public String print2() {
		return  "종류: "+ type + " 사이즈: " + size + " 가격: " + price;
	}
}
