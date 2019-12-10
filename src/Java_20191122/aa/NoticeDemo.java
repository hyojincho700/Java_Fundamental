package Java_20191122.aa;

public class NoticeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notice n = new Notice(); //여기 앞에 적힌 Notice가 접근을 결정함
		n.number = 10;
		n.title = "title";
		n.hit = 100;
		//같은 패키지에서는 private 접근 불가
		//n.regdate = "2019-11-22";
	}

}
