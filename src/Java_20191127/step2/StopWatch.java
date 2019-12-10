package Java_20191127.step2;

public class StopWatch {
	// FootStopNanoWatch의 인스턴스 변수와 인스턴스 메소드를 빼왔습니다.
	long startTime;
	long endTime;

	// start, stop 메소드 선언
	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		endTime = System.currentTimeMillis();
	}

	// 반환값이 더블이니까 return (double) 이 붙어야 함
	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}

	long startNanoTime;
	long endNanoTime;

	// overloading 안되어서 nano를 붙여 메소드 선언
	public void startNano() {
		startNanoTime = System.nanoTime();
	}

	public void stopNano() {
		endNanoTime = System.nanoTime();
	}

	public double getElapsedNanoTime() {
		return (double) (endNanoTime - startNanoTime) / (double) 1000000000;
	}
}

// 각각 다른 클래스가 섞여 있음. stopmilliwatch와 stopnanowatch로 분리하자.