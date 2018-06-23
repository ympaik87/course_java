
public class Person {

	// 주민 등록 번호
	// 이름
	private String jumin_number;
	private String name;
	
	// 직업
	// 현재 위치
	private String job;
	private String place;
	
	public Person(String jumin_number, String name) {
		this.jumin_number = jumin_number;
		this.name = name;
	}
	
	public void applyRename(boolean applied, String name) {
		
		if(applied) {
			System.out.println("개명 신청이 승인 되었습니다.");
			this.name = name;
		}else {
			System.out.println("개명 신청이 반려 되었습니다.");
		}
		
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	public void setPlace(String place) {
		this.place = place;
	}

	
	
}
