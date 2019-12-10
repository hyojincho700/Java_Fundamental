package Java_20191127.step5;

public class stopMicroWatch extends StopWatch2 {
	
	public void start() {
		startTime = System.nanoTime();
	}

	public void stop() {
		endTime = System.nanoTime();
	}

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000000000;
	}

	// 추가된 메소드 run
	public void run() {
		// 내부 메소드니까 s. 필요없음
		start();

		for (long i = 0; i < 500000001; i++) {

		}

		stop();

		double elapsedTime = getElapsedTime();
		//다른 거 수정할 필요가 없고
		System.out.printf("경과시간 : %.6f \n", elapsedTime);
	}
}
