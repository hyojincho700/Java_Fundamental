package Java_20191127.step5;

public class StopWatchDemo {
	//따라서 s.run이 되었습니다. 그런데 run도 공통되네요. 부모클래스 (StopWatch2) 에 넣어주면 됩니다.
	//넣어주었더니 이렇게 깔끔해졌습니다. 다른 요구가 생긴다 하더라도 여기에 추가할 필요가 없어졌네요.
	//추상클래스의 polymorphism
	public void execute(StopWatch2 s){
		s.run();
	}
	
	/*public void execute(StopWatch2 s){
	    s.run();
	}
	
	public void execute(stopWatch2 s){
		s.run();
    */

	public static void main(String[] args) {
		//swd 객체를 생성한 이유는 인스턴스 메소드 execute를 호출하기 위해서다. static이 아니기 때문.
		StopWatchDemo swd = new StopWatchDemo();
		
		stopNanoWatch s = new stopNanoWatch(); 
		swd.execute(s);
		
		stopMiiliWatch s1 = new stopMiiliWatch();
		swd.execute(s1);
		
		stopMicroWatch s2 = new stopMicroWatch();
		swd.execute(s2);
		
	}

}

//여기에 마이크로세컨드를 추가해도 큰 변화가 없습니다.