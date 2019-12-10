package Java_20191127.step6;

//클래스를 분류해 보니 클래스 이름에 nano가 있는데 굳이 안에도 nano가 있어야 하나?
//nano 지웁시다.
public class stopNanoWatch extends StopWatch2{
	//상위클래스의 정보가 은닉되었기 때문에 자식클래스가 참조할 때 오류가 생깁니당. setter를 통해 정보를 수정합니다.
	private void start() {
		setStartTime(System.nanoTime());
	}

	private void stop() {
		setEndTime(System.nanoTime());
	}
	//getter를 통해 정보를 가져옵니다. 그리고 은닉화 (private 붙이기)
	private double getElapsedTime() {
		return (double) (getEndTime() - getStartTime()) / (double) 1000000000;
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
