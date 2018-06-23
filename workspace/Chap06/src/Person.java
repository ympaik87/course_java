
public class Person {

	private int age;
	private String name;
	
	
	// Setter : 외부로 부터 값을 매개변수로 받아와서 내부 멤버변수에 대입(set) 하는 메소드
	// setXXX 형태로 만든다.
	public void setAge(int _age) {
		
		if( _age < 0 ) {
			System.out.println("나이가 잘못 되었습니다. " + _age);
			return;
		}
		
		age = _age;
	}
	
	public void setName(String _name) {
		name = _name;
	}
	
	// Getter : 외부에서 해당 클래스의 멤버 변수가 필요 할 시 반환 시켜 전달 하는 역할(get) 하는 메소드
	// getXXX 형태로 만든다.
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
}




