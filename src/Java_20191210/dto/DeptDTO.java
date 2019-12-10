package Java_20191210.dto;

public class DeptDTO {
	private int no; // Java : 클래스 이름을 변수에 할당하지 않는다.
	private String name; // DB의 칼럼명은 JOIN 때문에 절차지향식으로 지음
	private String loc;
	public DeptDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeptDTO(int no, String name, String loc) {
		super();
		this.no = no;
		this.name = name;
		this.loc = loc;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
