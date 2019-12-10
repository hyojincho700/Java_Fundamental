package Java_20191121;

public class LotteryDemo2 {
	public static void main(String[] args) {
		// Math.random() => 0보다 크거나 같고 1보다 작은 임의의 double 값을 반환
		int[] lotto = new int[6];// 어떤 값이 들어올지 모르니까 값 할당 안 함

		for (int i = 0; i < lotto.length; i++) {
			double random = Math.random();
			// 1부터 45까지 임의값을 temp에 저장한다
			int temp = (int) (random * 45) + 1;
			// temp값을 현재 위치에 무조건 집어 넣는다. 만약 중복되는 경우는 i를 증가시키지 않고 새로운 temp값을 넣기
			// 때문에 문제가 생기지 않는다.
			lotto[i] = temp;
			for (int j = 0; j < i; j++) {
				// temp변수와 j인덱스에 있는 배열값이 같은 경우
				if (lotto[j] == temp) {
					// i를 증가시키지 않고 현재 위치에 있도록 설정하기 위해서 i--
					// break를 추가하여 더이상 연산을 안하도록 처리함
					i--;
					break;// 이건 if문이 아닌 for문을 빠져나가는 break
				}
			}

		}

		// 오름차순 정렬 (bubble sort) : 앞뒤를 비교하는 패턴. 외우기
		for (int i = 0; i < lotto.length; i++) { // 바깥은 길이보다 하나 짧게 돌리고
			for (int j = 0; j < lotto.length - (i + 1); j++) { // length만큼 비교하면
																// 나중에 넘어가버림. 안에
																// 잇는 건 위에 있는 변수
																// 참조해서 하나 적게
																// 돌리고.
				if (lotto[j] > lotto[j + 1]) { // 스위치 하는 패턴
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}

			}
		}
		for (int i : lotto) {
			System.out.print(i + "\t");

		}
	}
}
