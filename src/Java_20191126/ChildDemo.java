package Java_20191126;

public class ChildDemo {
	public static void main(String[] args) {
		Parent p1 = new Parent(); //이건 부모
		p1.age = 55;
		p1.work();
		p1.playBadook();
		
		Child c1 = new Child();
		c1.age = 25; //상속 받았기 때문에 사용 가능
		c1.height = 155.24;
		c1.playBadook(); //상속 받았기 때문에 사용 가능
		c1.playGame();
		c1.work(); // ★ 부모 자식 둘다 있는 overriding 한 건 자기 자신(자식) 것으로 호출 ★ 
		
		//parent가 객체를 생성할 수 없는 경우 (추상클래스, 인터페이스)
		Parent p2 = new Child();
		p2.age = 25; 
		//p2.height = 155.24;
		p2.playBadook(); 
		//p2.playGame();
		p2.work(); // ★  자신(Child)의 work()로 호출 ★ 
		
		//이건 말이 안됩니다 아예 가리킬 수가 없어요 문법상 문제는 없지만 해봤자 말짱 도루묵이에요
		//Child c2 = (Child) new Parent();
	}
}
