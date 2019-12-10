package Java_20191127.step3;

public class StopWatch {
	//FootStopNanoWatch의 인스턴스 변수와 인스턴스 메소드를 빼왔습니다.
	long startTime;
	long endTime;
	//start, stop 메소드 선언
	public void start(){
		startTime = System.currentTimeMillis();
	}
	public void stop(){
		endTime = System.currentTimeMillis();
	}

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}

	long startNanoTime;
	long endNanoTime;
    //overloading 안되어서 nano를 붙여 메소드 선언
	public void startNano(){
		startNanoTime = System.nanoTime();
	}
	public void stopNano(){
		endNanoTime = System.nanoTime();
	}
	public double getElapsedNanoTime() {
		return (double) (endNanoTime - startNanoTime) / (double) 1000000000;
	}
}
