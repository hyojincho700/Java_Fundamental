package Java_20191125;

public class MethodDemo {
	//int return
	public int plus(int first, int second) { //int first, int second => 매개변수(parameter)
		return first + second;
	} 
	
	//double return
	public double divide(int first, int second) {
		return (double) first / (double) second;
	}

	//reference(array) return
	public int[] ascending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - (i + 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
	
	//boolean return. 윤년 구하는 메소드. 일일이 코딩 안해도 되니까 편함
	public boolean isLeafYear(int year){
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	
	//void는 호출만 하면 끝. return이 없습니다.
	public void print(String str){ 
		System.out.print(str); //매개변수로 온 str를 단지 출력하는 것 뿐
	}

	//메소드 사용법!
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();// 객체(object)생성 -(클래스명, 참조변수 = new 클래스명();) 

		int temp1 = md.plus(10, 20);//10, 20 => 전달인자 (Argument)

		System.out.println(temp1);

		double temp2 = md.divide(22, 5);

		System.out.println(temp2);

		int[] temp4 = { 1, 42, 45, 3, 10, 9, 80, 34 };

		int[] temp5 = md.ascending(temp4);

		for (int value : temp5) {
			System.out.print(value + "\t");
		}
		
		boolean temp6 = md.isLeafYear(2019);
		if(temp6){
			System.out.println("윤년");
		}else{
			System.out.println("평년");
		}
		
		md.print("월요일 입니다");
		}
	}
