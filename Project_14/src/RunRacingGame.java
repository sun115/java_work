import java.util.Random;

//	경마
//	1. 시작점과 끝점(몇m인지)
//	2. 각각 말들마다 한 턴당 달리는 거리 변화주기 (랜덤or변수(말의컨디션,부스트,스퍼트,status가중치)
//	3. 매 턴마다 어떤말이 몇m 갔는지 기록
//	4. 순위 기록 - 가장 먼저 결승점을 통과한 말부터



public class RunRacingGame {
	public static void main(String[] args) {
		String[] names = {"퀵실버","적토마","흑로"};
		RacingGame[] horses = new RacingGame[names.length];
		
		for (int i = 0; i < names.length; i++) {
			horses[i] = new RacingGame(names[i], horses, 0, 100);
		}
		// 순서 설정
//		Random rand = new Random();
//		int tmp = rand.nextInt(6)+5;
//		for (int i = 0; i < horses.length; i++) {
//			horses[i].readyRacing(horses, 0, 100);
//		}
		horses[0].goRacing();
	}
	 

}
