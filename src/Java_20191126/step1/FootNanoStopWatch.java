package Java_20191126.step1;

public class FootNanoStopWatch {
	long startTime;
	long endTime;
	
	long startNanoTime;
	long endNanoTime;
	public double getElapsedMilliTime(){
		return (double)(endTime-startTime)/(double)1000;
	}

	public double getElapsedNanoTime(){
		return (double)(endNanoTime-startNanoTime)/(double)1000000000;
	}
	public static void main(String[] args) {
		FootNanoStopWatch f = new FootNanoStopWatch();
		//1970년 1월 1일부터 지금까지 시간을 밀리세컨드로 반환
		//f.startTime = System.currentTimeMillis();
		f.startNanoTime = System.nanoTime();
		
		for(long i=0;i<5000000000l;i++){
			
		}
		
		//f.endTime = System.currentTimeMillis();
		f.endNanoTime = System.nanoTime();
		
		double elapsedTime = f.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
}
