
public class P_Score01 {
	// 객체데이터 만들기
	String name;
	int kor;
	int eng;
	int math;
	int total;
	
	@Override
	public String toString() {
		return this.name + "총점: " + this.total + "(국어 " + this.kor + " 영어 " + this.eng + " 수학 " + this.math + ")\n";
	}
}
