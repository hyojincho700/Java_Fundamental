package Java_20191127.step4;

//5. 실제 비지니스 로직을 메서드 (execute) 로 분리하자 (메인함수 안에 있던 걸 바깥으로 뺍니다)
public class StopWatchDemo {
	public void execute(stopNanoWatch s){
		s.start();

		for (long i = 0; i < 500000001; i++) {

		}
	
		s.stop();

		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
	
	public void execute(stopMiiliWatch s){
		s.start();

		for (long i = 0; i < 500000001; i++) {

		}
	
		s.stop();

		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
	

	public static void main(String[] args) {
		//swd 객체를 생성한 이유는 인스턴스 메소드 execute를 호출하기 위해서다. static이 아니기 때문.
		StopWatchDemo swd = new StopWatchDemo();
		
		stopNanoWatch s = new stopNanoWatch(); 
		swd.execute(s);
		
		stopMiiliWatch s1 = new stopMiiliWatch();
		swd.execute(s1);
		
	}

}
//step4의 문제점은.. 마이크로 세컨드가 들어오면 execute를 또 만들어야 한다는 거.
//고객이 뭔가를 요구했을 때 클래스만 더 추가할 수 있게 다형성을 구현해보자.
//  (=공통분모가 있으면 더 빼보자 && 비즈니스로직을 각각의 해당 클래스에 만들어보자)