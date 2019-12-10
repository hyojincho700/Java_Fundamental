package Java_20191127;
// /** -> java documentation 주석
/**
 이 클래스는 인터페이스를 테스트합니다. 
 */
import java.util.*;
import java.sql.*;
public class ImplementClassDemo {
	/**
	 이 메소드는 JVM이 호출해주는 메소드입니다.
	 */
	public static void main(String[] args) {
		//Java_5 19p 패키지 사용법 3
		//Date d = new date(); //모호하다고 뜸. java.util에도, java.sql에도 date가 있기 때문
		java.util.Date d = new java.util.Date();
		//실제 구현한 놈 ImplementClass에서 mA, mB, mC 다 호출할 수 있음. 
		InterA a = new ImplementClass();
		a.mA();
		a.mB();
		a.mC();
		}
}
