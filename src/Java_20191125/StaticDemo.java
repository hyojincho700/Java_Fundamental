package Java_20191125;

public class StaticDemo {
	//5-6라인까지는 멤버 변수 자리예요~
	static String name; //static 변수 
	int age; //instance 변수
	
	// instance method
	public void m1(){ 
		name = "sung"; //인스턴스 메소드에서는 static 변수 사용 가능
		age = 10; //인스턴스 메소드에서는 인스턴스 변수 사용 가능
		m2(); //인스턴스 메소드에서는 인스턴스 메소드 호출 가능
		m4(); //인스턴스 메소드에서는 static 메소드 호출 가능
	}
	// instance method
	public void m2(){
		System.out.println("instance method m2()");
	}
	// static method
	public static void m3(){
		name = "sung"; //static 메소드에서는 static 변수 사용 가능
		//age = 10; //static 메소드에서는 인스턴스 변수 사용 불가
		//m2(); //static 메소드에서는 인스턴스 메소드 호출 불가
		m4(); //static 메소드에서는 static 메소드 호출 가능
		
		StaticDemo sd = new StaticDemo(); // instance 변수와 instance 메소드를 사용하기 위해 new 하는거예요.
		sd.age = 10;
		sd.m2();
	}
	// static method
	public static void m4(){
		System.out.println("static method m4()");
	}
	}

