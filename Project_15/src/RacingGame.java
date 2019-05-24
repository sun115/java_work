import java.util.Random;

public class RacingGame {
	public static void main(String[] args) {
		// 조심 HORSE_NAMES, END_DISTANCE가 너무 많으면 출력 ERROR
		final String[] HORSE_NAMES = { "고지인", "김경현", "김동준", "김예근", "정형석", "권슬기", "박종선", "임선영", "임태현", "김성림", "박성민",
				"공현", "이형섭", "이원근", "김해리", "서보국", "조태엽", "최성욱", "김선화", "김유림", "박재원", "최수찬", "송진우", "최연식", "정예은", "이신우",
				"지배욱" };
		final int END_DISTANCE = 100;
		final int START_HORSE_INDEX = 0;
		final int HORSE_POWER = 1;
		Random random = new Random();
		Horse[] horse = new Horse[HORSE_NAMES.length];
		for (int i = 0; i < horse.length; i++) {
			int eachCondition = random.nextInt(3) + 2;
			horse[i] = new Horse(horse, HORSE_NAMES[i], HORSE_POWER, eachCondition, END_DISTANCE, i);
		}
		horse[START_HORSE_INDEX].runHorse();

	}
}
