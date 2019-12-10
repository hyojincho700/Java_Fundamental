package Java_20191126.step5;

//로직 없어짐!!
public class StopWatchDemo { 
	public static void execute(StopWatch s){
		s.run();
		}
	
	//둘 중에 아무 객체나 넘기면 run이 실행됨
	public static void main(String[] args) throws Exception{
		String input = args[0];
		input = "Java_20191126.step5."+input;
		
		//사실 9-16라인까지는 바라지 않음 ㅋㅋㅋㅋㅋ
		//newInstance가 문자열을 객체화 시켜서~ 문자열은 패키지명+클래스명~ (java reflection)
		StopWatch s1 = (StopWatch) Class.forName(input).newInstance(); 
		
		execute(s1);
	
	}

}
