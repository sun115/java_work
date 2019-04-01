
public class Student4Go {
	public static void main(String[] args) {
//		Student4 s4 = new Student4();
//		s4.name = "test";
//		System.out.println(s4);
		
		Student4[] sArr = new Student4[3];
		
		for (int i=0; i<sArr.length; i++) {
			sArr[i] = new Student4((i+1) + "번 학생");
			sArr[i].inputData();
		}
		
		for (int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
	}

}
