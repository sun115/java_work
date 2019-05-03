import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(list);
		list.add("XXX");
		System.out.println(list);
		list.add("VVV");
		System.out.println(list);
		list.add("ZZZ");
		System.out.println(list);
		list.set(1, "AAAA");			// 수정. 1번 자리를 AAAA로 replace
		System.out.println(list);
		
		String tmp = list.get(2);
		System.out.println(tmp);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(12);
		list2.add(13);
		System.out.println(list2);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
