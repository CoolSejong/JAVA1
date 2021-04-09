package array;

public class Towdimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr = { {1,2,3}, {4,5,6,7} };
		
	//	System.out.println(arr.length);
	//	System.out.println(arr[0].length);
	//	System.out.println(arr[1].length);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
