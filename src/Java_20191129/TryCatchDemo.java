package Java_20191129;

public class TryCatchDemo {
	public static double getAvg(int k, int e) {
		int sum = k + e;
		double avg = (double) sum / (double) 2;
		return avg;
	}

	// error가 남. args[0]번째 args[1]번째가 없기 때문에. run confi- 에다가 인자를 넣어줘야 작동함
	public static void main(String[] args) {
		try {
			int k = Integer.parseInt(args[0]); // 인자를 잘 못 넣을 수 있잖아요! 13-14 라인에
												// 에러가 발생할 수 있음
			int e = Integer.parseInt(args[1]); // 따라서 예외처리를 해주어야 함
			double average = getAvg(k, e);
			System.out.printf("평균 : %.2f", average);
		} catch (NumberFormatException e) {
			//e.printStackTrace(); //에러가 어디서 났는지, 어떤 이유로 났는지 확인하는 방법 (초창기 때 많이 사용)
								 //콘솔창에서만 뜨고 사용자한테는 안 보임
			//System.out.println(e.getMessage()); //에러 메시지 넣는 방법 (초창기 때 많이 사용)
			System.err.println("숫자를 넣어주세요");
		} catch (ArrayIndexOutOfBoundsException e){
			System.err.println("국어와 영어 점수를 넣어 주세요.");
		}
	}
}