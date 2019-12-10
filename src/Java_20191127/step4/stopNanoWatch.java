package Java_20191127.step4;

//클래스를 분류해 보니 클래스 이름에 nano가 있는데 굳이 안에도 nano가 있어야 하나?
//nano 지웁시다.
public class stopNanoWatch {
	long startTime;
	long endTime;
   
	public void start(){
		startTime = System.nanoTime();
	}
	public void stop(){
		endTime = System.nanoTime();
	}
	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000000000;
	}
}

//이렇게 되니까 stopmilliwatch랑 stopnanowatch의 변수명은 똑같아지고 기능만 달라진 걸 알 수 있습니다.