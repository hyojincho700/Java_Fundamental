package Java_20191127.step6;

public class stopMiiliWatch extends StopWatch2 {
	//상위클래스의 정보가 은닉되었기 때문에 자식클래스가 참조할 때 오류가 생깁니당. setter를 통해 정보를 수정합니다.
	private void start() {
		setStartTime(System.currentTimeMillis());
	}

	private void stop() {
		setEndTime(System.currentTimeMillis());
	}
	
	//getter를 통해 정보를 가져옵니다. 그리고 은닉화 (private 붙이기)
	private double getElapsedTime() {
		return (double) (getEndTime() - getStartTime()) / (double) 1000;
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
