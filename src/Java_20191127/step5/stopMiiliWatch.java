package Java_20191127.step5;

public class stopMiiliWatch extends StopWatch2 {
	
	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		endTime = System.currentTimeMillis();
	}

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}

	// 추가된 메소드 run
	public void run() {
		// 내부 메소드니까 s. 필요없음
		start();

		for (long i = 0; i < 500000001; i++) {

		}

		stop();

		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.3f \n", elapsedTime);
	}
}
