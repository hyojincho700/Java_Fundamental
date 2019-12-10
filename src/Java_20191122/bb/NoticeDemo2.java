package Java_20191122.bb;
// 서로 다른 패키지의 클래스를 사용하기 위해서는 반드시 import 해줘야 한다.(사용할 클래스는 반드시 public이어야 함)
import Java_20191122.aa.Notice;

public class NoticeDemo2 extends Notice{
	public static void main(String[] args) {
		Notice n = new Notice(); // 얘는 상속 관계가 없기 때문에 public만 접근 가능함 
		n.number = 10;
		//n.title = "title";
		//n.hit = 100;
		//n.regdate = "2019-11-22";
		
		// Notice 클래스를 상속 받은 NoticeDemo2 클래스로 객체를 생성한 경우에는
		// public, protected 접근이 가능함.
		NoticeDemo2 nc = new NoticeDemo2(); 
		nc.number = 10;
		nc.title = "title";
		
	}
}
