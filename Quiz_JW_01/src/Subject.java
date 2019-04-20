import java.util.Random;

public class Subject extends Student implements GradeManage <Subject>{
//	String[] student = new String[10];
	
	double[] midScores = new double[3];
	double[] finalScores = new double[3];
	double[] quizScores = new double[3];
	
	double ranking;
	
	Java java = new Java();
	Python python = new Python();
	DB db = new DB();
	
	
	// 학생정보 배열에 데이터를 추가하는 메소드
//	@Override
//	public Object SubjectInfo() {
//		// TODO Auto-generated method stub
//		Random rand = new Random();	
//		
//		for (int i = 0; i < student.length; i++) {
//			this.student[i] += this.javaAvg;
//			this.student[i] += this.pythonAvg;
//			this.student[i] += this.dbAvg;
//			this.student[i] += this.attendance;
//		}
//		return student;
//	}

	@Override
	public void setAvg() {
		// TODO Auto-generated method stub
		double sumsum1 = 0;
		double sumsum2 = 0;
		double sumsum3 = 0;
		for (int i = 0; i < midScores.length; i++) {
			sumsum1 += midScores[i];
		}
		this.midAvg = sumsum1/midScores.length;
		
		for (int i = 0; i < finalScores.length; i++) {
			sumsum2 += finalScores[i];
		}
		this.finalAvg = sumsum2/finalScores.length;
		
		for (int i = 0; i < quizScores.length; i++) {
			sumsum3 += quizScores[i];
		}
		this.quizAvg = sumsum3/quizScores.length;
		
	}



	@Override
	public void setScore(Subject o) {
		// TODO Auto-generated method stub
		
		this.ranking = (this.midAvg + this.finalAvg + this.quizAvg + this.attendance)/4;
//		Arrays.sort(student)
		
//		if(ranking > ) {
//			this.level = "A";
//		} else if (ranking > (int)10*0.5) {
//			this.level = "B";
//		} else if (ranking > (int)10*0.75) {
//			this.level = "C";
//		} else {
//			this.level = "D";
//		}
	}
	

	
	@Override
	public int compareTo(Subject o) {
		// TODO Auto-generated method stub
		if(this.ranking < o.ranking) {
			return 1;  // 나보다 작으면 뒤로(1) 보내기
		} else if (this.ranking > o.ranking) {
			return -1;  // 나보다 크면 앞으로(-1) 보내기
		}
		return 0;
	}

}
