//	짱구, 철수, 유리는 369 게임을 하고 있다. 369 게임 규칙에 맞춰서 결과를 출력하시오.
//	(제약 사항)
//	1) 1부터 50까지 짱구, 철수, 유리가 돌아가면서 숫자를 출력하세요. 게임에서 틀리는 사람은 없다고 가정합니다. 즉 모든 사람은 50까지 정답만 말합니다(출력합니다).
//	2) 369 게임은 숫자에 3,6,9가 들어간 경우 숫자 대신 '짝'이라는 박수소리를 출력하세요. (ex. 13인 경우 13을 출력하는 대신 '짝'을 출력. 33인 경우 '짝짝'을 출력)

public class Game369 {
	public static void main(String[] args) {

		String[] players = { "짱구", "철수", "유리","맹구" };
		int totalNum = 520;
		int totalPlayerNum = 4;

		int playerCount = 0;
		for (int i = 1; i <= totalNum; i++) {
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
}
