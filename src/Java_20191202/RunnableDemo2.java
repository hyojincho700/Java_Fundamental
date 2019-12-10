package Java_20191202;

public class RunnableDemo2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			String ThreadName = Thread.currentThread().getName();
			System.out.printf("%s : %d%n", ThreadName, i);
		}
	}

	public static void main(String[] args) {
		System.out.println("*****start*****");
		
		RunnableDemo2 r1 = new RunnableDemo2();
		Thread t1 = new Thread(r1, "first thread"); // 어떤 객체를 쓰레드로 할 지 정해야 하니까 매개변수 두 개
		t1.start(); // implements runnable 의 경우에는 쓰레드가 되려면 무조건 쓰레드로 start 해야 함
		
		RunnableDemo2 r2 = new RunnableDemo2();
		Thread t2 = new Thread(r2, "first thread");
		t2.start();
		
		System.out.println("*****end*****");
		
	}
}
