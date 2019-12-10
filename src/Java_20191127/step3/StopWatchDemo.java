package Java_20191127.step3;

//3. 실제 비지니스 로직이 있는 클래스와 실행되는 클래스를 따로 분리해보자
//4. 시간 측정하는 기능을 메소드로 추출 (startNano, endNano)
public class StopWatchDemo {
	public static void main(String[] args) {
		//StopWatch를 만드는 거다. 이름, 변수 이름 바꾸자 
		stopNanoWatch s = new stopNanoWatch(); 
		//
		s.start();

		for (long i = 0; i < 500000001; i++) {

		}
		//로직을 없앱시다
		//f.endTime = System.nanoTime();
		s.stop();
	
		double elapsedTime = s.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
}

//메인함수에서 로직이 보이면 안됩니다.