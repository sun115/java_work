import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;

public class StudentListRun {
	public static void main(String[] args) {
		String[] names = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		List<StudentList> student = new ArrayList<StudentList>();

		for (int i = 0; i < names.length; i++) {
			student.add(new StudentList(names[i])); // 객체데이터 자체가 List에 들어감
		}

// 0. 하나씩 접근해보기
//		System.out.println(student.get(0));
//		System.out.println(student.get(4));

// 1. 배열로 만들기 - 캐스팅에 문제. 다음시간에 다시  
//		StudentList[] arr = student.toArray();
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].midTotal < arr[i].finTotal) {
//				System.out.println(arr[i]);
//			}
//		}
		
		StudentList[] arr = new StudentList[student.size()];
		student.toArray(arr);
		System.out.println(arr[0]);
		
// 2. collection 메소드를 이용한 정상적인 방법 (일렬로 만들고 쭉 접근하는 메소드 사용)
// 3. ArrayList 에서 forEach 메소드를 이용한 접근 (하나씩 돌아가면서 접근)
//		student.forEach(new Consumer<StudentList>() {
//			@Override
//			public void accept(StudentList t) {
//				if (t.midTotal < t.finTotal) {
//					System.out.println(t);
//				}
//			}
//		});

	}

}
