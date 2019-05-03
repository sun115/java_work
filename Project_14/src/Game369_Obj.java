import java.util.Scanner;

public class Game369_Obj {
	
	int startNum=0;
	int endNum=0;
	
	public Game369_Obj(int startNum, int playeendNumrNum) {
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	
	
	public void do369() {
		totalPlayerNum = 스캔받기
 		String[] players = new String[4];
		for (int i = 0; i < players.length; i++) {
			players[i] = Game369_Obj(1, 100);
		}
		
		int playerCount = 0;
		for (int i = 1; i <= endNum; i++) {
			char[] tempArray = String.valueOf(i).toCharArray();
			// 숫자를 쪼개 char 배열에 저장
			int sygCount = 0;
			for (int j = 0; j < tempArray.length; j++) {
				if (tempArray[j] == '3' || tempArray[j] == '6' || tempArray[j] == '9') {
					sygCount++; // 쪼갠 숫자 각각에 3, 6, 9가 있는 경우 그 개수를 카운트
				}
			}
			if (playerCount == totalPlayerNum) {
				playerCount = 0;
			}
			System.out.print(players[playerCount++] + ": ");
			if (sygCount == 0) {
				System.out.println(i);
			} else {
				for (int k = 1; k <= sygCount; k++)
					// i에 3, 6, 9가 있는 경우 그 개수만큼 '짝'을 표시함
					System.out.print("뽝");
				System.out.println();
			}

	}
	}



	private String Game369_Obj(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
