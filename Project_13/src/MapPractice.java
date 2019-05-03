import java.util.HashMap;
import java.util.Map;

public class MapPractice {
	public static void main(String[] args) {
//		HashMap<Key, Val>
//		1대1 dictionary같은 개념
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("hi", "hey");
		
		System.out.println(map);
		System.out.println(map.hashCode());
		
//		Set entrySet()을 이용해 key-val이 결합된 entry형태로 반환
		for(Map.Entry<String, String> item : map.entrySet()){
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		
//		메소드와 결합한 형태 예제
//		HashMap <String, Student> map2 = new HashMap<String,Student>();
//		map2.put("name", new Student());
//		System.out.println(map);
		
	}

}
