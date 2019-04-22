import java.util.Arrays;
import java.util.Random;

public class Student_Run {
	public static void main(String[] args) {
		
		// student03 자료형의 arr 생성
		Student[] arr = new Student[10];
		String[] names = {"AAA","BBB","CCC","DDD","EEE","FFF","GGG","HHH","III","JJJ","KKK","LLL","MMM","NNN","OOO","PPP"};

		
		// student03 객체데이터들을 각각의 arr에 삽입
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student();
		}
		
		Random2 rand = new Random2();
		// 초기화된 값이 들어간 arr에 각각의 값 넣기
		for (int i = 0; i < arr.length; i++) {
			arr[i].name = names[i];
			// arr[i] = rand.randomStudent(arr[i]);
			rand.randomStudent(arr[i]);
		} 
		
		// 총점 for문 돌리기
		for (int i = 0; i < arr.length; i++) {
			arr[i].total = arr[i].kor+arr[i].eng+arr[i].math;
		}
		
		// 총점 순위별 정렬 (select)
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i; j < arr.length; j++) {
//				if(arr[i].total < arr[j].total) {
//					Student tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
		
		Arrays.sort(arr);
		
		
		// 출력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"등: "+ arr[i].print());
		}
		
	}

}
