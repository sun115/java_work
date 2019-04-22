import java.util.Arrays;

public class CallByReference {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = arr1;
		arr2[1] = 15;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//예외: str은 생성될때마다 주소를 새로 만들어줌.
		String aa = "abc";
		String bb = aa;
		bb = "def";
		System.out.println(aa);
		System.out.println(bb);
	}
}
