import java.util.Random;

public class Random2 extends Random {
	public Student randomStudent(Student target) {
		target.kor = this.nextInt(101);
		target.eng = this.nextInt(101);
		target.math = this.nextInt(101);
		target.total = target.kor + target.eng + target.math;
		return target;  //딱히 필요는 없지만 확실한 게 좋으니까.
	}
}
