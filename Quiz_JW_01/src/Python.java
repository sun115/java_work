import java.util.Random;

public class Python extends Subject{
	private int meScore;
	private int feScore;
	private int[] qScore = new int[3];
	private int qSum;
	private double qAvg;
	
	Random rand = new Random();
	public void pythonExam() {
		this.meScore = rand.nextInt(101);
		this.midScores[1] = this.meScore;
		this.feScore = rand.nextInt(101);
		this.finalScores[1] = this.feScore;
	}
	
	public void pythonQuiz() {
		for (int i = 0; i < qScore.length; i++) {
			this.qScore[i] = rand.nextInt(101);
			this.qSum += qScore[i];
		}
		this.qAvg = qSum/qScore.length;
		this.quizScores[1] = this.qAvg;
	}
	
}
