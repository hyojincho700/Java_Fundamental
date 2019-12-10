package Java_20191126;

public class Child extends Parent {
	double height = 170.23;
	
	//overriding : 부모의 메소드를 재정의
	//1. 메소드 이름, 매개변수, 반환형 일치
	//2. 접근 한정자는 부모보다 자식이 상위이거나 같으면 됨
	
	public void work(){
		super.work(); // parent 클래스의 work() 메소드 호출
		System.out.println("Child work()");
	}
	
	public void playGame(){
		System.out.println("Child playGame()");
	}
}
