
public class Person {
	private int age;
	private String name;
	
	// setter: 외부로 부터 값을 매개변수로 받아와서 내부 멤버변수에 대입(set) 하는 method
	// setXXX 형태로 만든다.
	public void setAge(int _age) {
		
		if(_age<0) {
			System.out.println("나이 입력이 잘 못 되었습니다." + _age);
			return;
		}
		
		age = _age;
	}
	
	public void setName(String _name) {
		name = _name;
	}
	
	// getter: 외부에서 해당 클래스의 멤버 변수가 필요할 시 반환시켜 전달하는 역할(get) 하는 method
	// getXXX 형태로 만든다.
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
}
