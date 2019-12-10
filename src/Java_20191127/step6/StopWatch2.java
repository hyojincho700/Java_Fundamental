package Java_20191127.step6;

public abstract class StopWatch2 {
	// 멤버 변수에 대한 Encapsulation
	// encapsulation을 위해 앞에 private를 붙여준다
	private long startTime;
	private long endTime;

	// private된 변수를 사용하기 위해 각각 setter getter를 만든다 
	// = 원본은 직접 건드리지 말고 함수를 통해 수정하고 사용하세요~ 라는 말
	
	// setter 메소드는 정보를 수정하기 위한 메소드
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	// getter 메소드는 정보를 가져오기 위한 메소드
	public long getStartTime() {
		return startTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public abstract void run();
}
