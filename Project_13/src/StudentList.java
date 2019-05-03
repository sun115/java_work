import java.util.Random;

public class StudentList {
	String name;
	int midTotal;
	int finTotal;
	
	StudentList(String name) {
		this.name = name;
		Random rand = new Random();
		this.midTotal = rand.nextInt(1001);
		this.finTotal = rand.nextInt(1001);
	}
	@Override
	public String toString() {
		return this.name + " (중간: " + this.midTotal + ", 기말: " + this.finTotal + ")";
	}
	
}
