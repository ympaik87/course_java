
public class Person {

	// �ֹ� ��� ��ȣ
	// �̸�
	private String jumin_number;
	private String name;
	
	// ����
	// ���� ��ġ
	private String job;
	private String place;
	
	public Person(String jumin_number, String name) {
		this.jumin_number = jumin_number;
		this.name = name;
	}
	
	public void applyRename(boolean applied, String name) {
		
		if(applied) {
			System.out.println("���� ��û�� ���� �Ǿ����ϴ�.");
			this.name = name;
		}else {
			System.out.println("���� ��û�� �ݷ� �Ǿ����ϴ�.");
		}
		
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	public void setPlace(String place) {
		this.place = place;
	}

	
	
}
