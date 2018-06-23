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
		
		//�ʱⱸ�� �����̴� -> X
		//Pencil p = new Writer();
		
		// �� �ʱⱸ�� �����̴�. -> O
		Pencil p = (Pencil)writer;
		p.foo();
		
		
		
		BallPen ballPen = new BallPen(1500, "����");
		ballPen.write("�ʱ��ʱ�");
		ballPen.refillBallPenColor("�Ķ�");
		ballPen.write("�ٲٰ� ���� �ʱ��ϱ�");
		
		
		Writer writer2 = new BallPen(1500, "����");
		
//		Pencil pp = (Pencil)writer2;
//		pp.foo();
		
		if(writer2 instanceof Pencil) {
			System.out.println("�� �ʱⱸ�� �����Դϴ�.");
			Pencil pp = (Pencil)writer;
			pp.foo();
		}else {
			System.out.println("�� �ʱⱸ�� �����Դϴ�.");
		}
		
		
	}
	
}


