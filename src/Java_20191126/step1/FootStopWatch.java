package Java_20191126.step1;

//1. 요구사항 : 밀리 세컨드로 경과 시간을 만들어 주세요...
	//2. 요구사항 : 나노 세컨드로 경과 시간을 만들어 주세요... 제발...
	public class FootStopWatch {
		long startTime; //currentTimeMillis 타입이 long이라서 long으로 선언함
		long endTime;
		public double getElapseMilliTime(){
			return (double)(endTime-startTime)/(double)1000;
		}
		public static void main(String[] args) {
			FootStopWatch f = new FootStopWatch();
			//1970년 1월 1일부터 지금까지 시간을 밀리세컨드로 반환
			f.startTime = System.currentTimeMillis();
			
			for(long i=0;i<999999999;i++){ //int로 선언 못하는 이유: int는 21억까지만 인식하기 때문에 그 이상을 넘어가 버리면 무한루프가 됨
			
			}
			
			f.endTime = System.currentTimeMillis();
			
			double elapsedTime = f.getElapseMilliTime();
			System.out.printf("경과시간 : %.3f", elapsedTime);
		}
	}


