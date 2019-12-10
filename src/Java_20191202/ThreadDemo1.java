package Java_20191202;

public class ThreadDemo1 extends Thread {
	public ThreadDemo1(String threadName) {
		super(threadName);
	}

	// 메인에서 객체를 만들어서 start를 호출하면 runnable 상태에 있고, 여기서 멈춰 있는 게 아니라 계속 흘러가서
	// println(end)까지 실행된다. -> 메인 메서드는 이미 끝나버렸지만 쓰레드는 계속 실행 됨.
	// run 메서드가 끝나면 쓰레드도 종료 됨
	// 메인 메서드와 쓰레드는 별도라는 걸 알아야 함★
	// (보통의 일반적인 프로그램은 t1이 끝나야 t2가 실행되고, t2가 끝나야 t3가 실행된다.)
	public void run() {
		for (int i = 0; i < 1000; i++) {
			String ThreadName = Thread.currentThread().getName();
			System.out.printf("%s : %d%n", ThreadName, i);
		}

	}

	public static void main(String[] args) {
		// 쓰레드 객체를 생성하는 방법
		// 1. Thread 클래스를 상속 받는다.
		// 2. run 메서드를 오버라이딩한다.
		// 3. 해당 객체(ThreadDemo)를 생성한다.
		// 4. 해당 객체로 start 메서드를 호출한다.
		System.out.println("**********start**********");
		ThreadDemo1 t1 = new ThreadDemo1("first thread");
		t1.start();

		ThreadDemo1 t2 = new ThreadDemo1("Second thread");
		t2.start();

		System.out.println("**********end**********");
	}
}
