import java.util.Random;
import java.util.Scanner;

public class Student implements Comparable <Subject>{
//	String[] student = new String[10];
	String name;
	double midAvg;
	double finalAvg;
	double quizAvg;
	int attendance;
	String level = "";
	
//	public abstract Object SubjectInfo();
	
	
	// 열 명의 학생 이름 입력받기
	public void name() {
		Scanner scan = new Scanner(System.in);
		this.name = scan.nextLine();
	}
	
	
	public Student Studentinfo(Student target) {
		target.midAvg = this.midAvg;
		target.finalAvg = this.finalAvg;
		target.quizAvg = this.quizAvg;
		target.attendance = this.attendance;
		return target;  //딱히 필요는 없지만 확실한 게 좋으니까.
	}
	
	
	public String print() {
		return this.name + " (중간 " + this.midAvg + " 기말 " + this.finalAvg + " 퀴즈 " + this.quizAvg + "출석" + this.attendance + ") 학점 : " + this.level;
	}

	@Override
	public int compareTo(Subject o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
