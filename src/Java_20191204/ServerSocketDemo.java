package Java_20191204;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketDemo {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
			try {
				for(int i=1;i<65536;i++);
				//ServerSocket 클래스는 해당 서버의 port 번호를 사용할 수 있으면
				//ServerSocket 객체를 사용할 수 있고, 그렇지 않으면 예외 발생
				//즉, 예외가 발생한다는 얘기는 해당 port를 사용한다는 의미
				serverSocket = new ServerSocket();
				System.out.println("번호를 사용할 수 있습니다.");
			} catch (IOException e) {
				System.err.println("번호를 사용할 수 없습니다.");
			}
	}
}
