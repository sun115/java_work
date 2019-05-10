import java.util.ArrayList;
import java.util.Collections;

public class RunPlayerVO {
	public static void main(String[] args) {
		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		list.add(new PlayerVO("박종선","투수",2019));
		list.add(new PlayerVO("권슬기","포수",2005));
		list.add(new PlayerVO("최수찬","1루수",2003));
		list.add(new PlayerVO("이형섭","2루수",2010));
		list.add(new PlayerVO("박재원","3루수",2000));
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("\n"+list);
	}

}
