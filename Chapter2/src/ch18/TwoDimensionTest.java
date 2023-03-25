package ch18;

public class TwoDimensionTest {

	public static void main(String[] args) {
		int[][] arr = { {1,2,3}, {1,2,3,4}};
		int i, j;
		
		for(i =0; i<arr.length; i++) { // arr 의 행의 길이를 나타낸다.
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(", \t" + arr[i].length);
			System.out.println();
		}
	}

}
