import java.util.Arrays;
import java.util.Random;

public class StudentRun02 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		Student02[] student = new Student02[10];
		
		// 각각 객체데이터를 어레이로 묶어서 생성
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student02();
		}
		
		// 각 객체데이터의 값 넣기
		for (int i = 0; i < student.length; i++) {
			student[i].name = (i+1)+"번 | ";
			student[i].kor = rand.nextInt(101);
			student[i].eng = rand.nextInt(101);
			student[i].math = rand.nextInt(101);
		}
		
		// 각 객체데이터의 총점 구해서 넣기
		for (int i = 0; i < student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
		}
		
		// 1등부터 정렬 !!!공식!!!
		for (int i = 0; i < student.length; i++) {
			for(int j=i; j<student.length; j++){
				if(student[i].total < student[j].total) {
					Student02 tmp = student[i];
					student[i] = student[j];
					student[j] = tmp;
				}
			}
		}
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].print());
		}
		
//		System.out.println(Arrays.toString(student));

	}
}
