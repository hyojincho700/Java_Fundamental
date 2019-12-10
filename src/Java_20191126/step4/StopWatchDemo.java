package Java_20191126.step4;

public class StopWatchDemo {
	public static void execute(StopNanoWatch s){
		//로직을 만드는 게 왜 나와있냐~ 스탑나노워치로 가야함
		s.start(); 
		for(long i=0;i<5000000000l;i++){
			
		}
		s.stop();
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
	
	public static void execute(StopMilliWatch s){
		s.start();
		for(long i=0;i<5000000000l;i++){
			
		}
		s.stop();
		double elapsedTime = s.getElasepdMilliTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
	
	public static void main(String[] args) { //반복되는 게 너무 많으니 부모 클래스 (step5, stopwatch) 를 만들어보자.
		
		StopMilliWatch s1 = new StopMilliWatch();
		execute(s1);
		
		StopNanoWatch s2 = new StopNanoWatch();
		execute(s2);
	}

}
