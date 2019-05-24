import java.util.Random;

public class Horse {
	private String name;
	private int position;
	private int horsePower;
	private int condition;
	private int endDistance;
	private boolean racingComplete = false;
	private StringBuffer jjum = new StringBuffer();
	private StringBuffer clear = new StringBuffer();
	static int rank;
	private Horse[] horse;

	public Horse(Horse[] horse, String name, int horsePower, int condition, int endDistance, int position) {
		this.name = name;
		this.horsePower = horsePower;
		this.condition = condition;
		this.endDistance = endDistance;
		this.horse = horse;
		this.position = position;
		for (int i = 0; i < 50; i++) {
			this.clear.append("\n");
		}
	}

	private StringBuffer completeMessage = new StringBuffer();
	private StringBuffer outputMessage = new StringBuffer();

	public void runHorse() {
		clearScreen();
		isHorseComplete();
		outputMessage.setLength(0);
		for (int i = 0; i < horse.length; i++) {
			outputMessage.append(this.horse[i].jjum);
			outputMessage.append(this.horse[i].name);
			outputMessage.append(this.horse[i].completeMessage);
			outputMessage.append("\n");
		}
		System.out.println(outputMessage);
		trySleep(10);
		isGameEnd();
	}

	private void clearScreen() {
		System.out.println(clear);
	}

	private void trySleep(int value) {
		try {
			Thread.sleep(value);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void isHorseComplete() {
		if (racingComplete == false) {
			if (jjum.length() < this.endDistance) {
				runMethod();
				rankCalculation();
			}
		}
	}

	private Random random = new Random();

	private void runMethod() {
		int moveDistance = horsePower + random.nextInt(condition + 1);
		for (int i = 0; i < moveDistance; i++) {
			this.jjum.append(".");
		}
	}

	private void rankCalculation() {
		if (jjum.length() >= this.endDistance) {
			this.jjum.setLength(0);
			for (int i = 0; i < this.endDistance; i++) {
				this.jjum.append("*");
			}
			rank += 1;
			this.completeMessage.append(" " + rank + "등");
			this.racingComplete = true;
		}
	}

	private void isGameEnd() {
		if (rank >= this.horse.length) {
			System.out.println("경기 종료");
		} else {
			this.horse[(this.position + (this.horse.length - 1)) % this.horse.length].runHorse();
		}
	}
}
