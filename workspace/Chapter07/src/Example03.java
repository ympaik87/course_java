
public class Example03 {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1231344", "홍길동");
		p1.setJob("회사원");
		p1.setPlace("회사");
		
		p1.applyRename(true, "긴또깡");
		
	}
}
