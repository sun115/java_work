import java.util.Arrays;
import java.util.Random;

public class P_Score00 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		P_Score01[] student = new P_Score01[10];
		
		// 각각 객체데이터를 어레이로 묶어서 생성
		for (int i = 0; i < student.length; i++) {
			student[i] = new P_Score01();
		}
		
		// 각 객체데이터의 값 넣기
		for (int i = 0; i < student.length; i++) {
			student[i].name = (i+1)+"번 학생 - ";
			student[i].kor = rand.nextInt(101);
			student[i].eng = rand.nextInt(101);
			student[i].math = rand.nextInt(101);
		}
		
		// 각 객체데이터의 총점 구해서 넣기
		for (int i = 0; i < student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
		}
		
		System.out.println(Arrays.toString(student));

	}
}
