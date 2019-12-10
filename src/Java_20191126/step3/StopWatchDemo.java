package Java_20191126.step3;

public class StopWatchDemo {
	//메인에서는 로직을 만들면 안 됨. 메소드로 빼서 만들어보자. (->step4)
	public static void main(String[] args) {
		StopNanoWatch s = new StopNanoWatch();
		s.start();
		for(long i=0;i<5000000000l;i++){
			
		}
		s.stop();
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}

}
