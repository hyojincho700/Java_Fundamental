package Java_20191128;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		//HashMap : key 값은 반드시 유일해야 하고, value에는 데이터(객체)를 저장하는데
		//데이터의 중복을 허용한다. key값이 중복되는 경우는 덮어쓰기를 한다.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("1", 11111);
		map.put("2", 22222);
		map.put("3", 33333);
		map.put("4", 44444);
		map.put("5", 55555);
		map.put("1", 66666);
		
		Integer value = map.get("1");
		System.out.println(value);
		
		
		//키 값을 알아내는 메소드 (키 값을 알아내야 모든 값을 가져올 수 있음)
		Set<String> set = map.keySet(); //keyset의 반환값은 set(맨 앞), set에는 string만 저장.
		Iterator<String> i = set.iterator(); //set 값 가져오려면 iterator 필요
		while(i.hasNext()){
			String k = i.next();
			Integer v = map.get(k); //value에는 integer가 저장되어있음
			System.out.format("key : %s, value : %d%n", k,v);
		}
	}
}

//set : add iterator
//list : add (index 값) get
//map : put (key 값) get