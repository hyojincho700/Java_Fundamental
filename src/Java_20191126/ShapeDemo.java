package Java_20191126;

public class ShapeDemo {
	public static void run(Shape s){ 
		s.draw();
	}
	
	public static void main(String[] args) {
		//추상 클래스는 객체를 생성할 수 없음
		//Shape s = new Shape();
		//shape를 이용해서 rectangle에 있는 draw를 호출하려면 아래와 같이 코드를 짜야 함
		Shape s1 = new Rectangle();
		s1.draw();
		
		//shape를 이용해서 triangle에 있는 draw를 호출함
		Shape s2 = new Triangle();
		s2.draw();
		
		run(new Rectangle()); //run 메소드의 어떤 객체를 넣어주느냐에 따라서 추상클래스의 실행 방법이 달라진다.
		run(new Triangle());
	}
}
