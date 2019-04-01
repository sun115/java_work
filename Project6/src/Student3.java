
public class Student3 {
	public String name;
	int korScore;
	int engScore;
	int mathScore;
	
	// 클래스 이름과 동일한 메소드를 만들면 더 직관적인 사용 가능.
	public Student3(String name) {
		this.name = name;
	}
	
	public Student3(String name, int korScore, int engScore, int mathScore) {
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

}
