package kr.co.smh.chap17.example;

//���׸� : �Ϲ�ȭ
// �Ϲ�ȭ��? : �ϳ��� Ŭ������ Ư����� �� Ŭ������ ����ϰ� �� �ְڴ�. ex) AppleBox�� Apple�� ��� ����
// Object Ŭ������ Ȱ���� Box Ŭ���� ���� ���� ��� �ڹ��� ��ü�� ��� ���� �ϱ� ������
// DownCasting �� �����ؾ� �ϰ�, instanceof�� ��� Ÿ�� �˻縦 �ؾ� �Ѵ�.

// ���׸��� ����ϸ� �����ڰ� ���� Ŭ������ �Ϲ�ȭ�� �׶��׶� �ٸ��� �� �� �ִ�.
public class GenericBox <T> {

	private T t;
	
	public void store(T t) {
		this.t = t;
	}
	public T getT() {
		return this.t;
	}
	
}
