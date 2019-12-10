package Java_20191128;

public class MathDemo {
	public static void main(String[] args) {
		double d1 = Math.ceil(4.1);
		System.out.println(d1);
		
		d1 = Math.floor(4.9);
		System.out.println(d1);
		
		long l1 = Math.round(42.789);
		System.out.println(l1);
		
		// 43 이 아니라 42.79를 만들고 싶다!
		d1 = Math.round(42.789*100); //42.789 * 100 을 long으로 받으면 소수점 이하가 잘려서 double로 받아야 함 
		System.out.println(d1/100);
		
		d1 = Math.abs(-4.3);
		System.out.println(d1);
		
		d1 = Math.sqrt(4);
		System.out.println(d1);
		
		d1 = Math.pow(2, 3);
		System.out.println(d1);
		
		d1 = Math.random();
		System.out.println(d1);
		
	}
}
