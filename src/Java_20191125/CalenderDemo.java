package Java_20191125;

public class CalenderDemo {
	private int year; // 접근지정자 private
	private int month;
	private int day;
	private int totalCount;
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// 메소드가 overloading 가능한 것처럼, 생성자도 overloading 가능하다!!!
	public CalenderDemo(int y){
		//year = y;
		this(y,0,0); // "생성자에서의 this를 통해 매개변수 3개짜리 호출해주세요~"라는 말
	}
	
	public CalenderDemo(int y, int m){
		//year = y;
		//month = m;
		this(y,m,0);
	}
	
	// 매개변수 3개짜리 생성자 (반환값 없음. void (이 자체도 반환값인거) 든 int 든 다 없음)
	public CalenderDemo(int year, int month, int day){
		this.year = year; // 멤버변수 = 매개변수;
		this.month = month;
		this.day = day;
		getTotalCount();
	}
	
	// 멤버변수의 값을 초기화하는 메소드 (반환값이 필요없으므로 void 사용)
	public void set(int y, int m, int d) { 
		year = y;
		month = m;
		day = d;
		getTotalCount();
	}

	private int getTotalCount(){
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
			for (int i = 0; i < preMonth; i++) {
				totalCount += monthArray[1];
			}
		}
		// 2019년 11월가지 합을 구했으면 날짜를 더하여 총 일수를 구한다.
		// totalCount += day;
		return totalCount + day;
	}

	public void print() {
		String message = null;
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
	/*
	public CalenderDemo(){
		
	}
	*/
	
	// 객체 만들어서 멤버변수에 있는 값 계산하고 나중에 메소드로 빼주세요~ <<메인 코드가 엄청 간단해짐. encapsulation>>
	public static void main(String[] args) {
		CalenderDemo c = new CalenderDemo(2019,12,25);
		//c.set(2019, 12, 25); // 초기화 했음 (88 라인에서 초기화 했으니까 이 라인은 의미 없는 코딩이 된 거임)
		//int count = c.getTotalCount(); // 메소드 통해서 빼오기
		c.print(); 
	}
}
