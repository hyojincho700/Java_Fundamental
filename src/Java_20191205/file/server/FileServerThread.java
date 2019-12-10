package Java_20191205.file.server;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class FileServerThread implements Runnable {
	private Socket socket;
	public FileServerThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String fileName = br.readLine(); // 파일 이름 읽기
			FileInputStream fis = new FileInputStream("C:\\dev\\io\\2019\\12\\"+fileName);
			
			//바이트 배열로 쓰기
			byte[] readBytes = new byte[1024*8];
			int readByteCount = 0;
			while((readByteCount = fis.read(readBytes)) != -1){
				OutputStream out = socket.getOutputStream();// 네트워크에 출력해야 함 -> 
															// 소켓을 이용해서 아웃풋스트림 만들기
				
				while((readByteCount = fis.read(readBytes)) != -1){
					out.write(readBytes, 0, readByteCount);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
