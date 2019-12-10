package Java_20191120;

public class ContinueDemo {
	public static void main(String[] args){
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if(i==6) continue; //i=6 일때 아래 문장을 수행하지 않고 나머지는 다 수행
			sum += i;
		}
		System.out.println(sum);
		
		
		if(true) return;//method 안에서 프로그램 종료를 호출할 때 사용
	 
		//2*1 ~ 2*4, 3*1 ~ 3*4, .......
		outter: 
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(j ==5) continue outter;
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
		}
	
	}

}
