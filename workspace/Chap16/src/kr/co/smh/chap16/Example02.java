package kr.co.smh.chap16;

public class Example02 {

	public static void main(String[] args) {

		int[][] arr2 = new int[2][3];

		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;

		arr2[1][0] = 4;
		arr2[1][1] = 5;
		arr2[1][2] = 6;

		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		// System.out.println(arr2[0][1].length);

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
		
		Object [] objArr = new Object[3];
		objArr[0] = new Object();
		objArr[1] = new Object();
		objArr[2] = new Object();
		

	}

}
