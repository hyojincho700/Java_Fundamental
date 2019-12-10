package Java_20191121;

public class ArrayDemo {
	public static void main(String[] args) {

		// 1. 배열 선언
		int[] a = new int[4];

		// 2. 배열 할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;

		// 3. 배열의 출력 (index를 알고 싶을 때)
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// 배열 생성과 할당을 동시에 설정
		int[] b = { 1, 2, 3, 4 }; // int[] b = new int[]{ 1, 2, 3, 4 }; 이것도 가능은 한데 잘 안 씀 

		// 배열의 값 변경(재할당)
		b[0] = 100;
		b[1] = 200;
		b[2] = 300;
		b[3] = 400;

		// enhanced for loop (index 필요 없고 값만 출력하고 싶을 때)
		for (int i : b) {
			System.out.println(i);
		}
	}
}
