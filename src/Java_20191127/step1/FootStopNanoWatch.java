package Java_20191127.step1;

//2. 요구 사항 : 나노 세컨드로 시간을 측정할 수 있는 애플리케이션을 만들어주세요.
public class FootStopNanoWatch {
	long startTime; //5-6, 11-12 / 8-9, 15-16 이 같은 성격임. 따로 묶을 수 있다. 클래스로 분류해봅시다.
	long endTime;
	
	long startNanoTime;
	long endNanoTime;
	
	public double getElapsedTime(){
		return (double) (endTime - startTime) / (double) 1000;
	}
	
	public double getElapsedNanoTime(){
		return (double) (endNanoTime - startNanoTime) / (double) 1000000000;
	}

	public static void main(String[] args) {
		FootStopNanoWatch f = new FootStopNanoWatch();
		//f.startTime = System.currentTimeMillis();
		f.startTime = System.nanoTime();

		for (long i = 0; i < 500000001; i++) {

		}
		//f.endTime = System.currentTimeMillis();
		f.endTime = System.nanoTime();
	
		double elapsedTime = f.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}
}

// 클래스 분리해봅시다. (step 2)