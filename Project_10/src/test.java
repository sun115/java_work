import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		//[선택정렬] 테스트
        System.out.println("=====[선택정렬]=====");
        int a[] = {68, 9, 32, 2, 14, 7, 31, 26};        
        Sort s = new Sort();
        System.out.printf("\n정렬할 원소 :");
        for(int v : a) {
            System.out.printf("%3d ", v);
        }
        System.out.println();
        s.selectionSort(a);

	}

}
