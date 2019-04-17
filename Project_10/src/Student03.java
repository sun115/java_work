
public class Student03 {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	
	
	public String print() {
		return this.name + " (국어 " + this.kor + " 영어 " + this.eng + " 수학 " + this.math + ") 총점 : " + this.total;
//		return String.format("%s : (국어 %d, 영어 %d, 수학 %d) 총점 : %d", this.name, this.kor, this.eng, this.math, this.total);
	}
	
	@Override
	public String toString() {
		String tmp = String.format("%03s", this.total);
		return tmp;
	}

}


