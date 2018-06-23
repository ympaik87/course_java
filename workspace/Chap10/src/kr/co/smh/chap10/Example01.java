package kr.co.smh.chap10;

import kr.co.smh.chap10.example.BallPen;
import kr.co.smh.chap10.example.Pencil;
import kr.co.smh.chap10.example.Writer;

public class Example01 {

	public static void main(String[] args) {
		
		Pencil pencil = new Pencil(1000);
		pencil.write("HiHi");
		pencil.refill();
		
		//upcasting
		Writer writer = new Pencil(1000);
		writer.write("Hello");
		writer.refill();
		
		pencil.foo();
		//writer.foo();
		
		//필기구는 연필이다 -> X
		//Pencil p = new Writer();
		
		// 이 필기구는 연필이다. -> O
		Pencil p = (Pencil)writer;
		p.foo();
		
		
		
		BallPen ballPen = new BallPen(1500, "빨강");
		ballPen.write("필기필기");
		ballPen.refillBallPenColor("파랑");
		ballPen.write("바꾸고 나서 필기하기");
		
		
		Writer writer2 = new BallPen(1500, "빨강");
		
//		Pencil pp = (Pencil)writer2;
//		pp.foo();
		
		if(writer2 instanceof Pencil) {
			System.out.println("이 필기구는 연필입니다.");
			Pencil pp = (Pencil)writer;
			pp.foo();
		}else {
			System.out.println("이 필기구는 볼펜입니다.");
		}
		
		
	}
	
}


