package homework;

//요일 구하는 거 만들어 놓은 거 있음
//마지막 일 수가 나오는 거 메서드로 만들어두면 됨 getLastDay 사용!

//년 달력은 바깥 forloop로 돌리고, 월을 안 forloop로 돌리면 된다요
//나머지만 리턴해주면 되잖어

//일단은 main에 다 때려박고 그 다음 oop적 관점으로 생각해보기

//zzzz

public class CalanderHomework {
	public static void main(String[] args) {
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");// 메인 함수에 달력 비스무리하게 출력하는 거
													  // 먼저 해보기
		// 빈 공백 출력하는 건 일월화수... 랑 숫자 출력된 사이에 코드가 들어가야겠지.
		int i = 0;
		for (i = 1; i <= 31; i++) {
			System.out.print(i + "\t");
			if (i % 7 == 0) {
				System.out.println();
			}
		}
	}
}
