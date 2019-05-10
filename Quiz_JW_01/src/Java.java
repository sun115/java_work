import java.util.Random;

 public class Java extends Subject{
	private int meScore;
	private int feScore;
	private int[] qScore = new int[3];
	private int qSum;
	private double qAvg;
	
	Random rand = new Random();

	public void javaExam() {
		this.meScore = rand.nextInt(101);
		super.midScores[0] = this.meScore;
		this.feScore = rand.nextInt(101);
		super.finalScores[0] = this.feScore;
	}
	
	
	public void javaQuiz() {
		for (int i = 0; i < qScore.length; i++) {
			this.qScore[i] = rand.nextInt(101);
			this.qSum += qScore[i];
		}
		this.qAvg = qSum/qScore.length;
		this.quizScores[0] = this.qAvg;
	}
	
	
//	return this.midScore = 
//	return this.finalScore = 
}
