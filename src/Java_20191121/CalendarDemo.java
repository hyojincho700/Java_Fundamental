package Java_20191121;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력만들기 1. 1년 1월 1일은 월요일 2. 1년 365일, 윤년은 366일 - 2월 29일 3. 윤년은 4년마다 발생하고
		 * 그 중에서 100배수는 제외하고 400의 배수는 제외하지 않는다. 4. 2019년 12월 25일 무슨 요일일까요?
		 */

		int year = 2019;
		int month = 12;
		int day = 25;
		String message = null;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// preYear => 2018년도
		int preYear = year - 1;
		// preMonth => 2019년 11월
		int preMonth = month - 1;
		int totalCount = 0;

		// 2018년도까지 총 일수 구하기
		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		// 2019년도가 윤년인지 판단한다.
		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

		// 2019년도가 윤년이면 2월 29일로 변경한다.
		if (isLeafYear) {
			monthArray[1] = 29;

			// 2019년도 11월까지 합 구하기
			for (int i = 0; i < preMonth; i++)
				;
			totalCount += monthArray[1];
		}

		// 2019년 11월가지 합을 구했으면 날짜를 더하여 총 일수를 구한다.
		totalCount += day;

		switch (totalCount % 7) {
		case 0:
			message = "일요일";
			break;
		case 1:
			message = "월요일";
			break;
		case 2:
			message = "화요일";
			break;
		case 3:
			message = "수요일";
			break;
		case 4:
			message = "목요일";
			break;
		case 5:
			message = "금요일";
			break;
		case 6:
			message = "토요일";
			break;

		}

		System.out.printf("%d년 %d월 %d일 %s 입니다.", year, month, day, message);
	}
}
