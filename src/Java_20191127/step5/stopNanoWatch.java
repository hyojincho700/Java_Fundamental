package Java_20191127.step5;

//클래스를 분류해 보니 클래스 이름에 nano가 있는데 굳이 안에도 nano가 있어야 하나?
//nano 지웁시다.
public class stopNanoWatch extends StopWatch2{

	public void start() {
		startTime = System.nanoTime();
	}

	public void stop() {
		endTime = System.nanoTime();
	}

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000000000;
	}

	public void run() {
		start();

		for (long i = 0; i < 500000001; i++) {

		}

		stop();

		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.9f \n", elapsedTime);
	}
}
