package kr.co.ymp.chap10;

import kr.co.ymp.chap10.example.Writer;
import kr.co.ymp.chap10.example.BallPen;
import kr.co.ymp.chap10.example.Pencil;

public class Example01 {
	public static void main(String[] args) {
		
		Pencil pencil = new Pencil(100);
		pencil.write("hihi");
		pencil.refill();
		
		// upcasting
		Writer writer = new Pencil(1000);
		writer.write("Hello");
		writer.refill();
		
		pencil.foo();
		// writer.foo(); --> 에러
		
		// 필기구는 연필이다 x
//		Pencil p = new Writer(); --> 에러
		
		// 이 필기구는 연필이다. o
		// Downcasting
		Pencil p = (Pencil)writer;
		p.foo();
		
		BallPen ballpen = new BallPen(2000, "빨간색");
		ballpen.write("필기필기");
		ballpen.refillBallPenColor("파랑색");
		ballpen.write("바꾸고 나서 필기하기");
		
		Writer writer2 = new BallPen(1500, "빨강");
		
//		Pencil pp = (Pencil)writer2; --> 에러. 볼팬은 연필로 형 변환 불가
//		pp.foo();
		
		if(writer instanceof Pencil) {
			System.out.println("이 필기구는 연필 입니다.");
			Pencil pp = (Pencil)writer;
			pp.foo();
		}
		
		if(writer2 instanceof Pencil) {
			System.out.println("이 필기구는 연필 입니다.");
			Pencil pp = (Pencil)writer;
			pp.foo();
		}else {
			System.out.println("이 필기구는 연필이 아닙니다.");
		}
		
	}
}
