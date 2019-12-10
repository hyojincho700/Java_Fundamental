package Java_20191119;

public class CastingDemo {
	public static void main(String[] args){
		//overflow 발생하여 compile error 발생
		//byte b1 = 250;
		
		byte b1 = (byte) 129; //circuit 발생, 권장하지 않음
		System.out.println(b1);
		
		int i1 = (int) 125.35; //cut 발생
		System.out.println(i1);
		
		double d1 = 124.5f; //auto casting
		
		byte b2 = 10;
		byte b3 = 20;
		// 산술 연산자는 반환값이 int 이기 때문에 전체를 byte로 
		// casting 해야 에러가 발생하지 않음
		byte b4 = (byte)(b1 + b2);//몇 개를 더할 일이 생길 수도 있으니 유념해서 선언하길.
		System.out.println(b4);
		
		int a1 = 10_000_000;
		System.out.println(a1);

	}

}
