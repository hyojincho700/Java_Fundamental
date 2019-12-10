package Java_20191127.step6;

//step5->step6
//모든 클래스의 Encapsulation 
//메인 클래스의 Java Reflection 추가 (문자열로 들어와 있는 클래스명을 객체화 시키는 방법)
public class StopWatchDemo {
	
	public void execute(StopWatch2 s){
		s.run();
	}
	

	public static void main(String[] args) throws Exception{
		//0번째 args 얻어 오기
		String input = args[0];
		String className = "Java_20191127.step6."+input;
		//부모로 캐스팅 하면 일일이 바꿀 필요 없다.
		StopWatch2 s = (StopWatch2)Class.forName(className).newInstance();
		StopWatchDemo swd = new StopWatchDemo();
		swd.execute(s);
		
	}

}
