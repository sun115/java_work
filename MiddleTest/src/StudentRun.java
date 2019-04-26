//	 총 100명의 성적 데이터를 생성한 후 성적이 올라간 학생들을 출력하시오.
//	(제약 사항)
//	1) student 클래스의 객체 데이터를 생성하고 랜덤한 값을 생성해서 성적 데이터를 입력
//	2) 성적 데이터는 중간고사 성적 (국어, 영어, 수학), 기말고사 성적 (국어, 영어, 수학) 을 입력. 즉 3과목의 성적 데이터를 중간고사와 기말고사로 구분해서 입력함.

public class StudentRun {
	public static void main(String[] args) {
		Student[] arr = new Student[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student();
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].name = (i+1)+ "번 학생 ";
			arr[i].doTest();
		}
		
		System.out.println("성적이 오른 학생은?\n");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].midAvg<arr[i].finAvg) {
				System.out.println(arr[i].print());
			}
		}
	}
}
