package Java_20191203;

public class CrawlingThreadDemo {
	public static void main(String[] args) {
		CrawlingThread c1 = new CrawlingThread("bitcoin.txt"); // 파일 이름 넣기
		c1.start(); // thread start 하면 실행 됨
	}
}
