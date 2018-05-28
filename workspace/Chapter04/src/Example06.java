
public class Example06 {
	public static void main(String[] args) {
		
		// 클래스: 참조 자료형
		Person p1 = new Person(); // instance (객체)
		p1.name = "백영민";
		p1.age = 32;
		p1.height = 173.9;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		
		// 객체 메모리 주소 값
		System.out.println(p1);
		
	}
}
