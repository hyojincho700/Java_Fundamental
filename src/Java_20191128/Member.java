package Java_20191128;

public class Member {
	//encapsulation
	private String id;
	private String name;
	
	//인스턴스 변수의 초기화를 위해 생성자 만듦
	public Member(String id, String name) { 
		super(); //생략 가능. 모든 생성자에는 super (부모 클래스 (여기선 object)의 디폴트 생성자 호출)가 숨어 있다.
		this.id = id;
		this.name = name;
	}
	
	//encapsulation된 변수를 가져오기 위해 setter getter를 만들어야 한다.
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
