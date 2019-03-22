import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		int student = 3;
		String name [] = new String [student];
		
		Scanner inputName = new Scanner(System.in);
		
		System.out.println("학생 이름을 입력해주세요.");
		for (int i = 0; i < name.length; i++) {
			name[i] = inputName.next();
		}
		System.out.println(Arrays.toString(name));
		
	}

}
