package Java_20191126;
import java.lang.*;
public class SubDemo extends Object {
	//alt + shift + s => c => enter
	public SubDemo(){
		super();
	}

	public static void main(String[] args) {
		Sub s1 = new Sub();
		s1.makeMoney();
		s1.gotoSchool();
		s1.play("omok");
		
		s1.money = 10000;
		s1.chicken = "교촌치킨 2마리";
	}

}
