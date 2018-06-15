package kr.co.ymp.chap16;

public class Example01 {
	public static void main(String[] args) {

		// 배열 만들기
		// 자료형 [] 변수명 = new 자료형[개수];

		int[] arr_score = new int[5];

		// index: 배열 원소의 순번을 의미한다.
		// 0번 부터 시작한다.
		// 0이상의 양수 정수만 올 수 있다. (음수, 실수는 사용 불가능)
		arr_score[0] = 90;
		arr_score[1] = 50;
		arr_score[2] = 83;
		arr_score[3] = 39;
		arr_score[4] = 29;

		double total = 0;
		
		// 마지막 index: 배열의 크기(개수) - 1

		for (int i = 0; i < arr_score.length; i++) {
			total += arr_score[i];
		}

		System.out.println("평균: " + total / (double) arr_score.length);
		
//		사용할 수 있는 원소의 인덱스를 벗어나면 ArrayIndexOutOfBoundsException 발생
//		System.out.println(arr_score[10]);
		
		// 배열 객체는 한번 생성되면 그 크기가 변할 수 없다.
		
	}
}
