package Java_20191125;

public class Member {
	private String name; // 4~12 라인 : 정보의 은닉화
	private String zipcode;
	private String address1;
	private String address2;
	private String ssn;
	private int age;
	private double height;
	private String password;
	private String email;

	// alt + shift + s => r => tab => enter => tab tab tab tab enter
	// name에 대한 setter 메소드 . 정보를 바꾸고 싶다면 setter를 통해 바꿀 수 있게 해줌
	public void setName(String n) { // 바뀌는 매개변수가 필요함
		this.name = n; // this가 붙은 게 멤버변수, 안 붙은 게 매개변수
	}

	// name에 대한 getter 메소드 . 바뀐 정보를 가지고 오고 싶다면 getter를 통해 가지고 올 수 있게 해줌
	public String getName() { // 그냥 가져오는 것이기 때문에 매개변수가 필요 없음
		return name;
	}

	public void setZipcode(String z) {
		zipcode = z;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setAddress1(String a1) {
		address1 = a1;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress2(String a2) {
		address2 = a2;
	}

	public String getAddress2() {
		return address2;
	}

	public void setSsn(String s) {
		ssn = s;
	}

	public String getSsn() {
		return ssn;
	}

	public void setAge(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double getHeight() {
		return height;
	}

	public void setPassword(String p) {
		password = p;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String e) {
		email = e;
	}

	public String getEmail() {
		return email;
	}

}