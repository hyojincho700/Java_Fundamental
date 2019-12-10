package Java_20191120;

public class ForDemo {
	public static void main(String[] args) {
		String str = "hello";
		int a1 = 10;
		int a2 = 20;
		double d1 = 12.4567;
		System.out.printf("%10s, %10d, %10d, %10f%n", str, a1, a2, d1);// 정수형은 %d, 실수열은 %f, 문자열은 %s, 여러 가지  자료형을  출력할 때  printf 사용
		System.out.println(str + ", " + a1 + ", " + a2 + ", " + d1);

		int sum = 0;
		long start = System.currentTimeMillis();
		// 1-100까지의 짝수 합
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("경과 시간 : " + (end - start));
		System.out.printf("1부터 100까지 합은 %d 입니다.%n", sum);

		// 2단 구구단
		for (int j = 1; j <= 9; j++) {
			System.out.printf("2 * %d = %d%n", j, 2 * j);
		}

		// 구구단 (이중 for문: 행은 바깥, 열은 안)
		for (int first = 2; first <= 9; first++) {
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d%n", first, second, first * second);
			}
		}

		// 구구단 역순
		for (int first = 9; first >= 2; first--) {
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d%n", first, second, first * second);
			}
		}

		// 별 개수 늘어나게 찍기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 별 개수 줄어들게 찍기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}