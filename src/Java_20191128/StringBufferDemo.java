package Java_20191128;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = new StringBuffer("test");
		
		//StringBuffer 클래스는 Object의 equals() 메소드를 overriding 하지 않았기 때문에
		//StringBuffer의 equals()를 사용하면 false가 반환된다.
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1);
		
		//문자열을 비교하고 싶으면 문자열로 바꾸어야 함
		String s3 = s1.toString();
		String s4 = s2.toString();
		System.out.println(s3.equals(s4));
		
		//스트링버퍼에 있는 건 이렇게 씁니다.
		StringBuffer sql = new StringBuffer();
		sql.append("select name, age ");
		sql.append("from member ");
		sql.append("where name = '성영한' ");
		sql.append("order by name desc ");
		
		System.out.println(sql);
		
		//stringbuffer를 재사용하고 싶으면 아래처럼 
		sql.setLength(0); //sql의 모든 문자열 지우기
		
		sql.append("select no, writer ");
		sql.append("from board");
		
		System.out.println(sql);
		
		
		
		
		
		
	}
	//여기서는 call by reference 하면 값이 바뀔거임

}
