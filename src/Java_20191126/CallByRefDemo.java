package Java_20191126;

public class CallByRefDemo {
		public static void change(int i, int[] j, String str){
			i=20;
			j[3]=400;
			str += "123";
		}
		
		public static void main(String[] args){
			int a = 10;
			int[] b = {1,2,3,4};
			String str = "abc";
			
			System.out.println(a);
			System.out.println(b[3]);
			System.out.println(str);
			
			//a => call by value, b => call by reference
			CallByRefDemo.change(a, b, str);
			
			System.out.println(a); //call by value 메소드 호출 후 변화 없음
			System.out.println(b[3]); //call by reference 메소드 호출 후 변화 있음
			System.out.println(str);
			
			//PT java_3 25p 변수의 유효범위 (지역 변수)
			//23라인 c는 선언만 하는 거지 메모리 할당 안 됨, 26라인 d는 메모리 할당 됨
		    int[] c;
		    //System.out.println(c); //메모리에 올라와 있지 않기 때문에 에러 나는 거임
		    c = new int[4]; 
		    
		    int[] d = null;
		    System.out.println(d);
		    d = new int[4];
		    
		    //int age; // 문법에 문제는 없지만 별로 추천하지 않음
		    int age = 0; // 값을 나중에 할당하고 싶다면 이렇게 선언하는 게 좋음
		    age = 10;
		}
			
	}
