import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper {
	public static void main(String[] args) {
		
		while (true) {
//	내가 낼 숫자 선택
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보를 해 보세요. \n 가위는 0, 바위는 1, 보는 2 입니다.");
		int me = scan.nextInt();
		
		
// ??	만약 사용자가 3 이상의 숫자를 쓴다면, 오류 해결법은?  *hint : for문
//		if (me > 3) {
//			System.out.println("0부터 2까지의 숫자만 입력해 주세요.");
//		} else { //뒤의 전체코드
//		
		
		
//	컴퓨터가 낼 랜덤 숫자 실행
		Random rsp = new Random();
		int com = rsp.nextInt(3);
		
//	내가 낸 숫자를 한글로 바꾸기
//		if (me==0) {
//			System.out.println("나 : 가위");}
//		else if (me==1) {
//			System.out.println("나 : 바위");}
//		else if (me==2) {System.out.println("나 : 보");}
//		else {System.out.println("0에서 2까지의 숫자만 입력해주세요");}
		
//	컴퓨터가 낸 숫자를 한글로 바꾸기		
//		if (com==0) {
//			System.out.println("컴  : 가위");}
//		else if (com==1) {
//			System.out.println("컴 : 바위");}
//		else if (com==2) {System.out.println("컴 : 보");}
//		else {System.out.println("0에서 2까지의 숫자만 입력해주세요");}
//		
		
		if (com == me) {
			System.out.println("DRAW");
		} else if (com==0 && me==1 ) {
			System.out.println("WIN");
		} else if (com==0 && me==2) {
			System.out.println("LOSE");
		} else if (com==1 && me==0) {
			System.out.println("LOSE");
		} else if (com==1 && me==2) {
			System.out.println("WIN");
		} else if (com==2 && me==0) {
			System.out.println("WIN");
		} else if (com==2 && me==0) {
			System.out.println("LOSE");
		} else {System.out.println("0에서 2까지의 숫자만 입력해주세요.\n");
		}
	//	}
		
}
}
}