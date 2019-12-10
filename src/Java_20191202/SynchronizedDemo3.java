package Java_20191202;

public class SynchronizedDemo3 implements Runnable{
	int x;
	int y;
	//같은 객체를 공유할 때만 synchronized 블록이 설정될 수 있다.
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++){
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x : %d, y : %d - %s%n",x,y,threadName);
		}
	}
	
	public static void main(String[] args){
		SynchronizedDemo3 s1 = new SynchronizedDemo3();
		SynchronizedDemo3 s2 = new SynchronizedDemo3();
		//쓰레드에 같은 객체를 넣은거랑 서로 다른 객체를 넣은거랑 결과값이 다르다.
		//s1 s1 => 결과값 2000.(인스턴스 변수 x, y를 공유한다)
		//s1 s2 => 결과값 1000.
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);
		
		//t1.start();
		//t2.start();
		
		while(true){
			try {
				Thread.sleep(5000); //5000 주기로.
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			new Thread(s1).start();
		}

		
	}
	
	

}
