
public class PlayerVO implements Comparable<PlayerVO>{
	private String name;
	private String position;
	private int regYear;

	
	public PlayerVO (String name, String position, int regYear) {
		this.name = name;
		this.position = position;
		this.regYear = regYear;
	}
	
	public String toString() {
		return name + "  " + position + "  " + regYear + "\n";
	}
	
	
	@Override
	public int compareTo(PlayerVO otherPlayer) {
		System.out.print("쳌\t");
//		return this.name.compareTo(otherPlayer.name);
		// 숫자비교 - 음수면 앞으로 보냄(값이 음수일땐 this가 앞으로, 양수일땐 뒤로)
		// 앞뒤변수 순서 바꾸면 내림 오름차수 조절.
		return this.regYear - otherPlayer.regYear;
	}

}
