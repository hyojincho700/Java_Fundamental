package Java_20191119;
//클래스명의 첫글자는 대문자
//두 단어가 합친 경우에는 두번째 단어의 첫글자를 대문자로 사용 - camel case	
public class IdentifierDemo {
	public static void main(String[] args){
		int age = 10;
		String name = "hello";
		
		//첫글자는 숫자를 사용할 수 없음.
		//String 1father = "John";
		
		//공백을 사용할 수 없음.
		//String mother Name = "Michell";
		
		//예약어는 사용할 수 없음.
		//String void = "empty";
		
		//자바에서 문자는 유니코드를 의미하기 때문에 세계 모든 문자를 사용할 수 있음
		String 이름  = "조효진";
		
		System.out.println(이름);
	}
}
