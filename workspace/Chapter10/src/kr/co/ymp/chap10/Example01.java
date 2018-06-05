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
		// writer.foo(); --> ����
		
		// �ʱⱸ�� �����̴� x
//		Pencil p = new Writer(); --> ����
		
		// �� �ʱⱸ�� �����̴�. o
		// Downcasting
		Pencil p = (Pencil)writer;
		p.foo();
		
		BallPen ballpen = new BallPen(2000, "������");
		ballpen.write("�ʱ��ʱ�");
		ballpen.refillBallPenColor("�Ķ���");
		ballpen.write("�ٲٰ� ���� �ʱ��ϱ�");
		
		Writer writer2 = new BallPen(1500, "����");
		
//		Pencil pp = (Pencil)writer2; --> ����. ������ ���ʷ� �� ��ȯ �Ұ�
//		pp.foo();
		
		if(writer instanceof Pencil) {
			System.out.println("�� �ʱⱸ�� ���� �Դϴ�.");
			Pencil pp = (Pencil)writer;
			pp.foo();
		}
		
		if(writer2 instanceof Pencil) {
			System.out.println("�� �ʱⱸ�� ���� �Դϴ�.");
			Pencil pp = (Pencil)writer;
			pp.foo();
		}else {
			System.out.println("�� �ʱⱸ�� ������ �ƴմϴ�.");
		}
		
	}
}
