package Java_20191119;

public class OperatorDemo {
	public static void main(String[] args){
		int a = 7, b = 20;
		int c = 0;
		double d = 0;
		c = a + b;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);
		
		//double로 캐스팅할 때는 각각 캐스팅. 한 쪽만 캐스팅해도 상관 없음. auto casting이 되기 때문이다
		d = (double)b / (double)a; 
		System.out.println(d);
		
		c = b % a;
		System.out.println(c);
				
 		a += b; // a = a+b;
 		System.out.println(a);
 		
 		int sum = 0;
 		for(int i=1;i<=100;i++){
 			//sum = sum + i;
 			sum += i;
 		}
 		System.out.println(sum);
 		
 		a++;
 		++a;
 		a = 20;
 		//a = a+1;
 		
 		//대입 후 증가
 		c = a++;
 		System.out.println(c);
 		
 		//증가 후 대입
 		c = ++a;
 		System.out.println(c);
 		
 		a = 10;
 		b = 20;
 		
 		boolean isSuccess = false;
 		isSuccess = a>b;
 		System.out.println(isSuccess);
 		
 		isSuccess = a<b;
 		System.out.println(isSuccess);
 		
 		isSuccess = a>=b;
 		System.out.println(isSuccess);
 		
 		isSuccess = a<=b;
 		System.out.println(isSuccess);
 		
 		isSuccess = a==b;
 		System.out.println(isSuccess);
 		
 		isSuccess = a != b;
 		System.out.println(isSuccess);
 		
 		// a && b => a가 false면 b 연산을 하지 않음 (Short circuit)
 		// a || b => a가 true 면 b 연산을 하지 않음 (Short circuit)
 		isSuccess = (a==b) && (++a == ++b);
 		System.out.println(isSuccess);
 		System.out.println(a);
 		System.out.println(b);
 		
 		System.out.println(1+2+3+4+"5");
 		System.out.println("1"+2+3+4+5);
 		System.out.println("1"+(2+3)+4+5);
 		}

}
