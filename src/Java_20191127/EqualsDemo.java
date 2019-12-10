package Java_20191127;

class Car{
	String modelNumber;
	String color;
	Car(String modelNumber, String color){
		this.modelNumber = modelNumber;
		this.color = color;
	}
	//hashcode overriding : shift + alt + s -> generate hashcodes and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((modelNumber == null) ? 0 : modelNumber.hashCode());
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
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		return true;
	}
	
	//toString overriding : shift + alt + s -> toString
	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", color=" + color + "]";
	}

	
}
public class EqualsDemo {
	public static void main(String[] args) {
		Car c1 = new Car("00001","black");
		Car c2 = new Car("00001","black");
		//Car c2 = c1;
		
		//같은 해시코드를 가지게 하도록 Car class에 overriding 해준다.
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.toString());
		
	}
}
