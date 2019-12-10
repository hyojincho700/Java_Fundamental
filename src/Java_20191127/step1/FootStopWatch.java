package Java_20191127.step1;

//1. 요구 사항 : 밀리 세컨드로 시간을 측정할 수 있는 애플리케이션을 만들어주세요.
public class FootStopWatch {
	long startTime; //instance 변수 선언
	long endTime;

	public static void main(String[] args) {
		FootStopWatch f = new FootStopWatch();
		f.startTime = System.currentTimeMillis();

		for (long i = 0; i < 500000001; i++) {

		}
		f.endTime = System.currentTimeMillis();

		double elapsedTime = (double) (f.endTime - f.startTime) / (double) 1000;

		System.out.printf("경과시간 : %.3f %n", elapsedTime);
	}
}