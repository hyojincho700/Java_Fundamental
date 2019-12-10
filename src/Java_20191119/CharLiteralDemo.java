package Java_20191119;

public class CharLiteralDemo {
	public static void main(String[] args){
		//1. 유니코드 표현 => '\u0000'
		char c1 = '\uC870';
		char c2 = '\uD6A8';
		char c3 = '\uC9C4';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//2. 아스키코드 표현
		// 48 - 57  -> 0-9
		// 65 - 90  -> A-Z
		// 97 - 122 -> a-z
		char c4 = 100;
		System.out.println(c4);
		
		//3. 문자 표현 => ''
		char c5 = 'a';
		char c6 = '조';
		System.out.println(c5);
		System.out.println(c6);
		
		//escape char
		// \n => line feed
		// \t => tab
		// \\ => \
		// \" => "
		// \' => '
		// \n은 문자열 뒤에 바로 붙여 쓸 수 있다. 문자기 때문에
		System.out.println("hello\n"+"world");
		System.out.println("hello\t"+"world");
		
		String path = "C:\\dev\\\"eclipse\"";
		System.out.println(path);
	
		
	}

}
