package Java_20191126.step5;

//다른 건 다 변화 없고 표현만 바꿔주면 됨 (%.9f -> %.6f / 그리고 stopWatchDemo 가서 클래스만 툭툭 넣어주면 됨)
public class StopMicroWatch extends StopWatch {

	public void start() {
		startTime = System.nanoTime();
	}

	public void stop() {
		endTime = System.nanoTime();
	}

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000000000;
	}
	
	public void run(){
		start(); 
		for(long i=0;i<5000000000l;i++){
			
		}
		stop();
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.6f", elapsedTime);
	}
}
