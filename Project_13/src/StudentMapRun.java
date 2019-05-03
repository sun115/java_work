import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMapRun {
	public static void main(String[] args) {
		HashMap<String, StudentMap> student = new HashMap<String, StudentMap>();
		String[] names = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		for (int i = 0; i < names.length; i++) {
			student.put(names[i], new StudentMap(names[i])); // 객체데이터 자체가 List에 들어감
		}
		for(Map.Entry<String, StudentMap> item : student.entrySet()){
//			Student one = item.getValue(); 라고 지정해도 됨
			if(item.getValue().finTotal >  item.getValue().midTotal) {
			System.out.print(item.getKey());
			System.out.print(item.getValue()+"\n");
			}
		}
	}
}
