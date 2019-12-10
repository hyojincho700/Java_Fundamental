package Java_20191129;

public class ThrowDemo {
	public static double withdraw(String account, int amount) throws Exception{
		double myBalance = 10000; //내 잔고는 만원
		String myAccount = "123-123-1234"; //내 계정은 123-123-1234
		if(myAccount.equals(account)){ //내 계정과 balance 가 같아야 돈을 빼든 말든 할 거 아냐
			if(myBalance - amount >=0){  //계정이 맞으면 balance를 따져줘야 함
				myBalance -= amount;
			}else{
				throw new InsufficientBalanceException("잔고가 부족합니다. 넌 루저야!"); //어 그런데 Exception이 14라인이랑 이름이 같네. 클래스를 분리해 보자. (insufficient)
			}
		}else{
			throw new InCorrectAccountException("계좌번호가 잘못 되었습니다."); //계정이 잘못 되었을 때 예외 발생시키기
																	   //이것도 클래스를 분리해 보자. (insufficient)
		}
		return myBalance;
	}

	public static void main(String[] args) {
		double balance = 0;
		try {
			balance = withdraw("123-123-1234", 100000);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} 
		System.out.printf("인출 후 잔고는 %.2f입니다.", balance);
	}
}
