// 6의 배수 구하기


public class Times {
//	public void dotimes(int input) {
//		
//		System.out.println(input + "은 6의 배수일까요?");		
//		if (input % 6 == 0) {
//			System.out.println("ㅇ");
//		} else {System.out.println("ㄴ");
//		}
//		
//	}
	public boolean dotimes(int input) {
		if (input % 6 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
//		Times check = new Times();
//		check.dotimes(6554897);
		
		 Times c1 = new Times();
		 System.out.println("6의 배수는 ");
		 for (int i = 0; i < 100; i++){
			 int check = i + 1;
			 boolean result = c1.dotimes(check);
			 if(result) {
				 System.out.print(" " + (check));
			 }
		 }
	}
}
