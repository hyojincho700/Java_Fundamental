package Java_20191126;
//i18n = Internationalization (국제화)
//l10n = Localization (지역화)
public class StaticInitializationDemo {
	int age; // instance variable
	static String title; //static variable
	//모든 객체가 공유하는 것이기 때문에 값을 일정한 값으로 fix 시킵니다. 인자를 받고 자시고 할 것이 없음. 
	static{
		System.out.println("static block");
		title = "모기지론";
	}
	
	//생성자의 접근 한정자는 객체 생성과 관련 있다.
	public StaticInitializationDemo(int age){
		this.age = age;
		System.out.println("constructor");
	}
	
	//main이 호출되기 전에 static block이 먼저 출력된다.
	public static void main(String[] args) {
		System.out.println("main");
		new StaticInitializationDemo(10); //나이를 10으로 초기화
		new StaticInitializationDemo(20); //나이를 20으로 초기화
		new StaticInitializationDemo(30); //나이를 30으로 초기화
	}
}
