import java.util.Random;

public class StudentMap {
//	String name;
	int midTotal;
	int finTotal;
	int improve;
	
	StudentMap(String name) {
//		this.name = name;
		Random rand = new Random();
		this.midTotal = rand.nextInt(1001);
		this.finTotal = rand.nextInt(1001);
		this.improve = this.finTotal-this.midTotal;
	}
	@Override
	public String toString() {
		return "(중간: " + this.midTotal + ", 기말: " + this.finTotal + ")";
	}
}
