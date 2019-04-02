import java.util.Scanner;

public class QuizP1 {
	public String name;
	int korScore;
	int engScore;
	int mathScore;
	
	public void inputScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		this.name = scanner.nextLine();
		
		System.out.println("국어점수를 입력해주세요.");
		String korString = scanner.nextLine();
		this.korScore = Integer.parseInt(korString);
		
		System.out.println("영어점수를 입력해주세요.");
		String engString = scanner.nextLine();
		this.engScore = Integer.parseInt(engString);
		
		System.out.println("수학점수를 입력해주세요.");
		String mathString = scanner.nextLine();
		this.mathScore = Integer.parseInt(mathString);
	}

}
