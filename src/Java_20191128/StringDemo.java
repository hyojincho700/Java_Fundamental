package Java_20191128;

//java_6, 15p 예제들
public class StringDemo {
	public static void main(String[] args) {
		String str = "abcdefg";
		for (int i = 0; i < str.length(); i++) {
			// str 문자열에서 문자 하나를 끄집어 내는 메소드. ex) 주민등록번호에서 남자여자 구분하는 거 만들 수 있음
			System.out.println(str.charAt(i));
		}

		// 스트링끼리 연결해주는 메소드
		str = str.concat("abcd"); // str + "abcd" 한 것이랑 똑같다.
		System.out.println(str);

		// 인수로 지정한 문자열로 끝나는 경우 True값을 반환하며, 그렇지 않다면 False 값을 반환하는 메소드.
		// ex) 파일의 확장자로 속성을 구분하고 싶을 때
		String fileName = "abc.zip";
		if (fileName.endsWith("zip")) {
			System.out.println("zip 파일입니다.");
		} else if (fileName.endsWith("ppt")) {
			System.out.println("ppt 파일입니다.");
		}

		// 인수로 지정한 문자열로 시작하는 경우 True값을 반환하며, 그렇지 않다면 False 값을 반환하는 메소드.
		String uri = "artist/index.jsp";
		if (uri.startsWith("artist")) {
			System.out.println("작가 페이지입니다.");
		} else if (uri.startsWith("exhibition")) {
			System.out.println("전시 페이지입니다.");
		}

		// 대소문자를 구분하지 않고 문자열을 비교해 주는 메소드.
		System.out.println("abc".equalsIgnoreCase("aBC"));

		// 유니코드 문자열(String)을 바이트코드로 인코딩 해주는 메소드
		// 인코딩 / 디코딩 과정에 필요한 바이트배열을 만드는 메소드
		String s1 = "a";
		String s2 = "성";
		System.out.println(s1.getBytes().length);
		System.out.println(s2.getBytes().length);

		// 특정 문자열이 처음으로 나타나는 위치를 반환하는 메소드
		// str = "abcdefg"
		// 컴퓨터는 0부터 세니까 4임
		System.out.println(str.indexOf("e"));

		// 상당히 많이 쓰이는 메소드
		// 특정 문자열이 마지막에 나타나는 위치를 반환하는 메소드
		fileName = "abc.bde.fafb.asdf.ppt";
		System.out.println(fileName.lastIndexOf("."));

		// 문자열에서 특정 부분만 골라낼 때 사용하는 메소드
		String first = str.substring(0, 3); // (0, (str.indexOf(".")) 이런 식으로 바꿔쓸
											// 수 있다
		String second = str.substring(6); // (str.indexOf("."+1); 이런 식으로 바꿔쓸 수
											// 있다
		System.out.println(first);
		System.out.println(second);

		// regex : regular expression (정규표현식)
		// regex 를 replace 로 바꿔주는 메소드.
		String content = "abc\nabc\nabc\nabc";
		System.out.print(content);
		content = content.replaceAll("\n", "<br>");
		System.out.println(content);

		// 앞 뒤 공백 제거하는 메소드.
		s1 = "abc";
		s2 = "abc "; // 문자열에 공백이 들어가버리게 되면?
		System.out.println(s1);
		System.out.println(s2); // 매개변수에 length()를 넣어서 공백을 찾아내도 되긴 함
		System.out.println(s1.equals(s2)); // 죽어도 true가 안나옵니닼ㅋㅋㅋㅋ
		System.out.println(s1.trim().equals(s2.trim())); // 앞 뒤 공백 제거!중간 공백 제거는
															// 안 됨

		// 매개변수 100 을 스트링으로 바꾸어 주는 메소드 (primitive data type => String)
		// primitive 8개 타입을 overriding 해두었기 때문에 사용 가능
		s1 = String.valueOf(100); // 1+"";
		System.out.println(s1);

		// 굉장히 많이 쓰는 메소드.
		// 기준이 되는 매개변수 (- : 구분자(delimiter)) 로 문자열 (010-3024-1703) 을 쪼개는 메소드
		String phone = "010-3024-1703";
		String[] temp = phone.split("-");
		// enhanced for loop
		for (String string : temp) {
			System.out.println(string); // 쪼개진 문자열들 (token)
		}

		// Java_6 . 19p
		// 3$ : 3번째 인수부터 먼저 출력. "순서를 바꿔주는 놈이 있다" 정도만 알아두면 됨
		// pt에 나온 문법을 전부 다 적용하면 이렇게 되지만 실제로는 이렇게 잘 안 씀
		// %d, %f, comma 랑, 소수점 이하 몇째 자리까지 출력할 건지.. 정도만 기억하고 있으면 됨
		str = String.format("%3$,10.2f %2$,10.2f %1$,10.2f", 10000.234, 20000.123, 30000.456);
		System.out.println(str);
		
		//두 개는 같은 거.
		System.out.printf("%d%n",100);
		System.out.format("%d%n",100);

	}
}
