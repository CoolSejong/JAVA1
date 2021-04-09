package array;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {1, 2, 3, 4, 5};
		
		// System.arraycopy : 첫 번째 배열의 n 번째 부터 두 번째 배열의 m 부터 k만큼 값을 복사한다. 
		System.arraycopy(arr1, 0, arr2, 1, 3);
		
		for (int i = 0; i < arr2.length; i++)
			System.out.println(arr2[i]);
	}

}
