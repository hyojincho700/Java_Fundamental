package Java_20191126.step5;

//부모를 먼저 설계하고 자식을 상속할 순 없음 ㅋㅋㅋㅋ 따라서 밑에서부터 위로 끌고 올라가는 겁니다.
public abstract class StopWatch {
	long startTime; //상속받아야 하니까 private를 떼 버렸습니다.
	long endTime;
	public abstract void run();
}
