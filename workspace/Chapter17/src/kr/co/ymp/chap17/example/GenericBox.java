package kr.co.ymp.chap17.example;

// Generic: �Ϲ�ȭ
// �Ϲ�ȭ��?: �ϳ��� Ŭ������ Ư����� �� Ŭ������ ����ϰ� �� �ְڴ�. e.g. AppleBox�� Apple�� ��� ����.
// Object class�� Ȱ���� Box class���� ���� ��� �ڹ��� ��ü�� ��� �����ϱ� ������
// Downcasting�� �����ؾ� �ϰ�, instanceof�� ��� Ÿ�� �˻縦 �ؾ��Ѵ�.(����)

// Generic�� ����Ѹ� �����ڰ� ���� Ŭ������ �Ϲ�ȭ�� �׶��׶� �ٸ��� �� �� �ִ�.
public class GenericBox<T> {
	private T t;
	
	public void store(T t) {
		this.t= t;
	}
	
	public T getT() {
		return this.t;
	}
}
