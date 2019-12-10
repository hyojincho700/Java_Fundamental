package Java_20191127.step5;

public abstract class StopWatch2 {
	long startTime;
	long endTime;
	//추상메소드 run을 만드는 순간 overriding을 해야 한다는 강제성이 생긴다.
	//강제성을 부여하기 위해 이 클래스를 abstract로 만들어 버렸다.
	public abstract void run();
}
