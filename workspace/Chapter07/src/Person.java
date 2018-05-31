
public class Person {
	// 주민 등록 번호 --> 바뀌지 않는다 --> 생성자 이용
	// 이름 --> 바뀔 수도 있다. 로직 필요 --> method
	private String jumin_number;
	private String name;
	
	// 직업 --> 항상 바뀜 --> setter
	// 현재 위치
	private String job;
	private String place;
	
	
	public Person(String jumin_number, String name) {
		this.jumin_number = jumin_number;
		this.name = name;
	}
	
	public void applyRename(boolean applied, String name) {
		if(applied) {
			System.out.println("개명 신청이 승인되었습니다.");
			this.name = name;
		}else {
			System.out.println("개명 신청이 반려되었습니다.");
		}
	}
	
	
	public void setJob(String job) {
		this.job = job;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
}
