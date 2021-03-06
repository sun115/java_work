// 369 짝 짝짝 변형해보기
// 몇 명 참여시킬지 입력받기 
// player 맵으로 해보기
// 

public class PF_Person {
	String name;
	PF_Person[] players;
	int position;
	int srtNum;
	int endNum;
	int sayNum = 0;
	boolean startPlayer;
	
	PF_Person(String name){
		this.name = name;
	}
	
	// 플레이어들의 배열을 넘겨받음 (파라미터로)
	public void readyGame(PF_Person[] players, int position, int srtNum, int endNum) {
		// 게임에 참여한 사람들을 입력받음
		this.players = players;
		// 순서 파악 (내 포지션)
		this.position = position;
		// 시작-끝 순서 정하기
		this.srtNum = srtNum;
		this.endNum = endNum;
	}
	
	
		
	public void sayNum() {
		// 앞 사람이 말한 숫자의 +1 말하기/ position 이용
		int previousPosition = this.position -1;
		if(startPlayer) {
			this.sayNum = this.srtNum;
			this.startPlayer = false;
		} else if (previousPosition < 0) {
			previousPosition = this.players.length -1;
		}
		this.sayNum = this.players[previousPosition].sayNum + 1;
		
//		if (sayNum == 0) {
//			players[position].sayNum = this.srtNum;
//		} else if (previousPosition < 0) {
//			previousPosition = this.players.length -1;
//		}
//		this.sayNum = this.players[previousPosition].sayNum + 1;
//		this.sayNum = this.players[(this.position + (this.players.length-1)) % this.players.length].sayNum;
		System.out.println(this.name + " says " + this.sayNum);
		
		int nextPosition = (this.position + 1) % this.players.length;
		if (this.sayNum < this.endNum) {
			this.players[nextPosition].sayNum();
		}
	}
	
	public void gameStart() {
		this.players[this.players.length - 1].sayNum = this.srtNum -1;
		this.sayNum();
	}
	


}
