package Java_20191126.step2; // 드러운 걸 oop적으로 만들었습니다

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch s = new StopWatch();
		s.start();
		for(long i=0;i<999999999;i++){
			
		}
		s.stop();
		double elapsedTime = s.getElasepdMilliTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}
}
