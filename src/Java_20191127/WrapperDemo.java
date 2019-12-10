package Java_20191127;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		//자바 1.4 이전 버전에서는 primitive data type을 Collection에 저장할 수 없었기 때문에
		//primitive data type을 객체화 할 수 있는 Wrapper class로 변환하여 저장해야 한다.
		ArrayList list = new ArrayList(); 
		list.add(new Integer(1));
		list.add(new Integer(2));
		
		Integer i1 = (Integer)list.get(0);
		Integer i2 = (Integer)list.get(1);
		
		int a = i1.intValue() + i2.intValue();
		
		//자바 1.5 or 자바 5.0 이후
		//<> : arrange에다가 integer만 집어넣을 수 있음
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1); //auto-boxing
		list1.add(2); //auto-boxing
		
		Integer i3 = (Integer)list.get(0);
		Integer i4 = (Integer)list.get(1);
		
		int b = i3 + i4; //auto-unboxing
		
		String str = 10+""; //굉장히 저급한 방법ㅋㅋㅋㅋㅋㅋㅋㅋㅋ
		String str1 = String.valueOf(10); //우아한 방법 ㅋㅋㅋㅋㅋㅋ
		
		//문자열을 int로 바꿀 때 사용
		int d = Integer.parseInt("100");
;	}
}
