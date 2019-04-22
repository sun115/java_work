
public class Student implements Comparable<Student>{
	String name;
	int kor;
	int eng;
	int math;
	int total;
	
	static final int MOVE_FORWARD = -1;
	int MOVE_BACKWARD = 1;
	
	public String print() {
		return this.name + " (국어 " + this.kor + " 영어 " + this.eng + " 수학 " + this.math + ") 총점 : " + this.total;
	}
	
	@Override
	public String toString() {
		String tmp = String.format("%03s", this.total);
		return tmp;
	}
	
	// 비교 정렬하는 메소드(참조받음)
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.total < o.total) {
			return Student.MOVE_FORWARD;  // 나보다 작으면 뒤로(1) 보내기
		} else if (this.total > o.total) {
			return MOVE_BACKWARD;  // 나보다 크면 앞으로(-1) 보내기
		}
		return 0;  // 같으면 그냥 두기
	}

//	   제네릭 선언 없이 디폴트로 규칙을 사용할 경우
//
//			@Override
//			public int compareTo(Object o) {   //디폴트인 object로 파라메터를 받음.
//				Student s = (Student)o;        //클래스의 타입으로 캐스팅
//				if(this.total < s.total) {
//					return 1; 
//				} else if (this.total > s.total) {
//					return -1; 
//				}
//				return 0; 
//			}
//			
}
