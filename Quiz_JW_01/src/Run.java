import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		
		Student[] student = new Student[10];
		Student student2 = new Subject();
		Subject sj = new Subject();
//		
//		for (int i = 0; i < student.length; i++) {
//			student[i] = (String) subject.name();
//			student[i] += subject.SubjectInfo();
//		}
//		
//		for (int i = 0; i < student.length; i++) {
//			student[i] = new Student();
//		}
//		
		((Subject)student2).setAvg();
		
		for (int i = 0; i < student.length; i++) {
//			student[i].name();
			
			student2.Studentinfo(student[i]);
		} 
		
		
		Arrays.sort(student);
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].print());
		}
	}
}
