import java.util.Random;

public class DB extends Subject{
	private int meScore;
	private int feScore;
	private int[] qScore = new int[3];
	private int qSum;
	private double qAvg;
	
	Random rand = new Random();
	
	// 시험정보
	public void DBExam() {
		this.meScore = rand.nextInt(101);
		this.midScores[2] = this.meScore;
		this.feScore = rand.nextInt(101);
		this.finalScores[2] = this.feScore;
	}
	
	public void DBQuiz() {
		for (int i = 0; i < qScore.length; i++) {
			this.qScore[i] = rand.nextInt(101);
			this.qSum += qScore[i];
		}
		this.qAvg = qSum/qScore.length;
		this.quizScores[2] = this.qAvg;
	}
	
}
