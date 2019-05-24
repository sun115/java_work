import java.util.Random;

//	경마
//	1. 시작점과 끝점(몇m인지)
//	2. 각각 말들마다 한 턴당 달리는 거리 변화주기 (랜덤or변수(말의컨디션,부스트,스퍼트,status가중치)
//	3. 매 턴마다 어떤말이 몇m 갔는지 기록
//	4. 순위 기록 - 가장 먼저 결승점을 통과한 말부터

public class RacingGame {
	RacingGame[] horses;
	String name;
	int srtPoint;
	int endPoint;
	int turn = 0;
	int distance;
	int now;
	
	
	public RacingGame(String name, RacingGame[] horses, int srtPoint, int endPoint) {
		this.name = name;
		this.horses = horses;
		Random rand = new Random();
		this.distance = rand.nextInt(6)+5;
		this.srtPoint = srtPoint;
		this.endPoint = endPoint;
	}
	//	
//	public void readyRacing(RacingGame[] horses, int srtPoint, int endPoint) {
//		this.horses = horses;
//		Random rand = new Random();
//		this.distance = rand.nextInt(6)+5;
//		this.srtPoint = srtPoint;
//		this.endPoint = endPoint;
//	}
//	
	public void goRacing() {
		int previousDistance = srtPoint;
		for (int i = 0; i < horses.length; i++) {
			this.now =  previousDistance + this.horses[i].distance;
			if (this.now < this.endPoint) {
				this.horses[i].goRacing();
			} else {
				System.out.println(horses[i].name + " GOAL~!~!~!! ");
				break;
			}
			previousDistance = this.now;
		}
	}
	
//	public void gameStart() {
//		this.players[this.players.length - 1].sayNum = this.srtNum -1;
//		this.sayNum();
//	
//	}
}
