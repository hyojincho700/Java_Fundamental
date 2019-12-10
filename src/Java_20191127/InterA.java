package Java_20191127;

public interface InterA extends InterB, InterC{
		//인터페이스 변수는 public static final 생략 가능
		double PI = 3.14;
		//인터페이스 메소드의 접근 한정자를 붙이지 않으면 public
		//abstract 생략 가능 (생략되었다고 해서 default라고 생각하면 절대 안 됨!!!)
		void mA();
	}
