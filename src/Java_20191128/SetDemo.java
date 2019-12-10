package Java_20191128;

import java.util.HashSet;
import java.util.Iterator; //collection import : Control Shift o
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//HashSet은 데이터(객체)의 중복을 허용하지 않고, 순서가 없음.
		//객체 넣는 과정
		//HashSet set = new HashSet(); //진짜 랜덤하게 하고 싶으면 hashset. 
		
		//TreeSet은 데이터(객체)의 중복을 허용하지 않고, 출력 시 오름차순 정렬된다.
		TreeSet set = new TreeSet(); //이런 식으로 오름차순 정렬 등 다르게 하고 싶으면 다른 클래스 선택하면 된다.
		
	
		while(true){ //무한대로 돌려
			int random = (int)(Math.random()*45) + 1; //1부터 45의 임의의 값 나오게
			set.add(random); 
			if(set.size()==6) break; // set은 length 아니고 size. 6개의 숫자 나오면 break.
	    }
		
		//객체 꺼내오는 과정
		//set은 값을 get으로 꺼내올 수 없고 iterator를 통해 꺼내와야 한다
		Iterator i = set.iterator();
		while(i.hasNext()){ //hasnext() : hashset에 출력할 객체가 존재하는지 판단하는 메소드.
			int temp = (Integer)i.next(); //next() : 해당 객체를 가져온다.
			System.out.print(temp + "\t");
		}
		
		HashSet<Test> s = new HashSet<Test>();
		s.add(new Test(10));
		s.add(new Test(20));
		s.add(new Test(10));//32와 34 라인을 같은 객체로 만들고 싶다면 equals와 해시태그를 오버라이딩 해야 함 (47-65라인)
		
		System.out.println(s.size());

	}
}

class Test{
	int a;
	Test(int a){
		this.a= a;
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (a != other.a)
			return false;
		return true;
	}
}
