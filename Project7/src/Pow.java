import java.util.Scanner;

public class Pow {
	int inputNum = 0;
	private String 나머지2 = "";
	String inputStr;
	
	public void change() {
		Scanner scan = new Scanner(System.in);
		this.inputNum = scan.nextInt();
		
		String 나머지 = null;
		int 몫 = 0;
		
//		int index = 0;
//		String[] arr = new String[index];
		
		while(true) {
			
			
			if(this.inputNum>=8) {
				나머지 = Integer.toString(this.inputNum%8);
				this.나머지2 = 나머지  + this.나머지2;
				System.out.print(나머지);

				몫 = this.inputNum/8;
				this.inputNum = 몫;
			} else {
				this.inputStr = Integer.toString(this.inputNum);
				System.out.println(inputStr);
				
				break;
			}	
			
		}

		String result = this.inputStr + 나머지2;
		System.out.println(result);
//		for (int i = result.length() -1; i>=0; i--) {
//	         System.out.print(result.charAt(i));
//		}

	}
}
