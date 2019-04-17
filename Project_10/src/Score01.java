import java.util.Random;

public class Score01 extends Random{
	static int[] name1 = new int[3];
	static int[] name2 = new int[3];
	static int[] name3 = new int[3];
	static int[] name4 = new int[3];
	static int[] name5 = new int[3];
	static int[] name6 = new int[3];
	static int[] name7 = new int[3];
	static int[] name8 = new int[3];
	static int[] name9 = new int[3];
	static int[] name10 = new int[3];
	
	int[] scoreArr = new int[3];
	
	public int[] nextInt2(int[] name) {
		
		for(int i=0; i<scoreArr.length; i++) {
			scoreArr[i] = super.nextInt(100);
		}
		return scoreArr;
	}
	
	public void Ranking(int subject) {
//		scoreArr[subject].
	}

}
