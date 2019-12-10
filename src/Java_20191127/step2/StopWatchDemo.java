package Java_20191127.step2;

//3. 실제 비지니스 로직이 있는 클래스와 실행되는 클래스를 따로 분리해보자
//4. 시간 측정하는 기능을 메소드로 추출 (startNano, endNano)
public class StopWatchDemo {
	public static void main(String[] args) {
		//StopWatch를 만드는 거다. 이름, 변수 이름 바꾸자 
		StopWatch s = new StopWatch(); 
		//로직을 없앱시다
		//f.startTime = System.nanoTime();
		s.startNano();

		for (long i = 0; i < 500000001; i++) {

		}
		//로직을 없앱시다
		//f.endTime = System.nanoTime();
		s.stopNano();
	
		double elapsedTime = s.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
}

//stopWatch의 클래스가 잘못되었다. 다른 기능 (밀리세컨, 나노세컨) 을 가진 것이 같이 있으면 안됨 
//고객 수정사항이 또 오면 클래스를 또 만들고 또 수정하고 또 수정해야 하기 때문.
