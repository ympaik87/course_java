package kr.co.ymp.chap09.example;

public class Circle extends Shape{
	private int r;
	
	// �����ڿ��� ������ �ޱ�
	public Circle(int r) {
		super("��");
		this.r = r;
	}
	
	// �θ�Ŭ������ �ִ� makeArea()�� �ڽ�Ŭ������ Circle Ŭ������ ������
	// --> override
	public void makeArea() {
		super.area = r * r * 3; // �θ��� ���̰�
		// this.area�� ����
	}
	
}
