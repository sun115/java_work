
public class PF_Run {
	public static void main(String[] args) {
		final int GAME_START_NUMBER = 10;
		final int GAME_END_NUMBER = 100;
		
		String[] names = {"짱구","영희","철수"};
		PF_Person[] players = new PF_Person[names.length];
		
		// 객체 삽입
		// 배열 - main배열 필수 생성. main 배열에 method 배열(객체) 삽입 시, main 배열의 주소를 넘겨줌
		// = call by reference
		for (int i = 0; i < names.length; i++) {
			players[i] = new PF_Person(names[i]);
		}
		// 순서 설정
		for (int i = 0; i < players.length; i++) {
			players[i].readyGame(players, i, GAME_START_NUMBER, GAME_END_NUMBER);
		}
		
		System.out.println(players[2].position);
	
		
		players[1].gameStart();
//		players[1].sayNum();
//		players[2].sayNum();
//		players[0].sayNum();
//		players[1].sayNum();
//		players[2].sayNum();
//		players[0].sayNum();
//		players[1].sayNum();
//		players[2].sayNum();
//		players[0].sayNum();
		
	}

}
