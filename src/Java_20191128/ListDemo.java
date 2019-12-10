package Java_20191128;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		//ArrayList : 순서가 있고, 데이터(객체)의 중복을 허용한다.
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"terra",2500));
		list.add(new Product(2,"신라면",1000));
		list.add(new Product(3,"서울우유",3000));
		
		for (int i = 0; i < list.size(); i++) {
			Product temp = list.get(i); //제너릭 통해서 프로덕트만 들어오게 됐기 때문에 list.get을 프로덕트로 캐스팅할 필요가 없음
			System.out.println(temp);
		}
		
		//모두 삭제 => list.remove(int index) 사용해서
		for(int i=0;i<list.size();i++){
			list.remove(i--);
		}
		
		//제너릭으로 선언된 컬렉션은 enhance for loop로도 출력할 수 있다. (enhance for문도 배열에 쓰이니까)
		for (Product temp : list) {
			System.out.println(temp);
		}
		
	}
}

class Product {
	int number;
	String name;
	double price;

	Product(int number, String name, double price) {
		this.number = number;
		this.name = name;
		this.price = price;
	}

	@Override // A + S+ s. toString overriding
	public String toString() {
		return "Product [number=" + number + ", name=" + name + ", price=" + price + "]";
	}
}
