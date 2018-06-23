package kr.co.smh.chap16;

public class Example01 {

	public static void main(String[] args) {
		
		//배열 만들기
		// 자료형[] 변수명 = new 자료형[갯수];
		
		int[] arr_score = new int[10];
		
		//인덱스 : 배열 원소의 순번을 의미한다.
		//       0번부터 시작된다.
		//       0이상의 양수 정수만 올 수 있다. (음수, 실수는 사용 불가능)
		arr_score[0] = 90;
		arr_score[1] = 80;
		arr_score[2] = 70;
		arr_score[3] = 60;
		arr_score[4] = 50;
		
		arr_score[5] = 40;
		arr_score[6] = 30;
		arr_score[7] = 20;
		arr_score[8] = 10;
		arr_score[9] = 0;
		
		double total = 0;
		
		//마지막 인덱스 : 배열의 크기(갯수) - 1
		
		for(int i = 0; i < arr_score.length; i++) {
			total += arr_score[i];
		}
		
		System.out.println("평균 : " + total / (double)arr_score.length);

		// 사용 할 수 있는 원소의 인덱스를 벗어나면 ArrayIndexOutOfBoundException 발생
		System.out.println(arr_score[10]);
		// 배열 객체는 한번 생성되면 그 크기가 변할 수 없다.
		
	}
	
}



