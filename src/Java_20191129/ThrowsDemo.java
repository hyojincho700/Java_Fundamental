package Java_20191129;

public class ThrowsDemo {
	public static double getAverage(int[] temp) throws ArrayIndexOutOfBoundsException { // 허접하게
																						// 만들었으니까
																						// 조심하라고
																						// 경고
		int sum = 0;
		int k = temp[0];
		int m = temp[1];
		int e = temp[2];
		int h = temp[3];
		sum = k + m + e + h;
		return (double) sum / (double) 4;
	}

	public static void main(String[] args) {
		int[] exam = { 10 }; // 하나짜리 넣어서 9라인까지는 실행이 되는데 10라인부터 실행이 안 됨 -> 여기서 에러
								// 나는거임
		try {
			double avg = getAverage(exam); // 여기서는 JVM이 잡아줍니다.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("국어, 영어, 수학, 국사 4과목을 입력해야 합니다.");
		}
	}
}