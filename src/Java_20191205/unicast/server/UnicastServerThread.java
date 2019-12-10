package Java_20191205.unicast.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UnicastServerThread implements Runnable{
	private Socket socket;
	private BufferedReader br;
	private BufferedWriter bw;
	public UnicastServerThread(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			//읽는 객체
			//InputStream in = socket.getInputStream();
			//InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//쓰는 객체
			//OutputStream out = socket.getOutputStream();
			//1바이트로 통신하기 어려우니까 osw 사용
			//OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); 
			
			//x를 눌렀을 때 정상적으로 종료되게 하는 코드
			boolean isStop = false;
			while(!isStop){
				//읽고 보내는 작업을 여기서 합니다.
				String readLine = br.readLine();
				System.out.println(readLine);
				if(readLine.equals("exit")){
					isStop = true;
				}								
				bw.write(readLine); //readLine에는 개행이 없어서 밑줄에 newline이 있는거임
				bw.newLine();
				bw.flush();
			}
			
			System.out.println("클라이언트가 정상적으로 종료했습니다.....");
			
		} catch (IOException e) {
			System.err.println("클라이언트가 비정상적으로 종료했습니다.....");
			
		}
	}
}
