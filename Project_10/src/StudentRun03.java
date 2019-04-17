import java.util.Random;

public class StudentRun03 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		// student03 자료형의 arr 생성
		Student03[] arr = new Student03[10];
		
		// student03 객체데이터들을 각각의 arr에 삽입
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student03();
		}
		
		// 초기화된 값이 들어간 arr에 각각의 값 넣기
		for (int i = 0; i < arr.length; i++) {
			arr[i].name = (i+1)+ "번 학생 ";
			arr[i].kor = rand.nextInt(101);
			arr[i].eng = rand.nextInt(101);
			arr[i].math = rand.nextInt(101);
		}
		
		// 총점 for문 돌리기
		for (int i = 0; i < arr.length; i++) {
			arr[i].total = arr[i].kor+arr[i].eng+arr[i].math;
		}
		
		// 총점 순위별 정렬 (select)
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i].total < arr[j].total) {
					Student03 tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		// 출력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].print());
		}
		
	}

}
