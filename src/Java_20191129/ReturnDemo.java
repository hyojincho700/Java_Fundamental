package Java_20191129;

public class ReturnDemo {
	public void m(){
		int a = 10;
		int b = 20;
		int c = a+b;
		
		//특정한 조건이 되었을 때 그 이후의 문장을 수행 안하고 싶을 때 return 사용! 
		//메소드의 반환값이 void일 때만!!!
		if(c==30){ //c=30라면 이 밑에 있는 문장 수행 안하고 빠져나가고 싶다.
			return; //메서드의 반환값이 void라서 return문 사용 가능한거. void가 아니라면 반환값이 있다는 얘기 = return 옆에 반환값이 있어야 함.
		}
		
		System.out.printf("a+b = %d",c);
	}
	
	
	public static void main(String[] args){
		int a = 10;
		int b = a;
		int c = a+b;
		if(c==20){
			return;
		}
		
		System.out.println(c);
	}
}
