
public class test0408_2 extends test0408_1 {
	public void printResult() {
		// 상속이 이뤄졌을때만 접근
		super.printResult();
		System.out.println("더하면 : " + (this.no1+this.no2));
		System.out.println("빼면 : " + (this.no1-this.no2));
		System.out.println("곱하면 : " + (this.no1*this.no2));
		System.out.println("나누면 : " + ((double)this.no1/this.no2));
	}
	public void newMethod() {
		
	}


}
