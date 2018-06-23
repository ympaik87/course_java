
public class Example02 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(10);	//setter를 이용해 값 대입
		p1.setName("A");
		
		Person p2 = new Person();
		p2.setAge(-1);
		p2.setName("B");
		
		System.out.println(p1.getName() + " / " + p1.getAge());
		System.out.println(p2.getName() + " / " + p2.getAge());
		
		
	}
	
}
