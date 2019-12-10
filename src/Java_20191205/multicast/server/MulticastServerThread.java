package Java_20191205.multicast.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

public class MulticastServerThread implements Runnable{
	private Socket socket;
	private ArrayList<MulticastServerThread> list;
	private BufferedReader br;
	private BufferedWriter bw;
	public MulticastServerThread(Socket socket, ArrayList<MulticastServerThread> list){
		this.socket = socket;
		this.list =list;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); 
			
			boolean isStop = false;
			while(!isStop){
				String readLine = br.readLine();
				System.out.println(readLine);
				if(readLine.equals("exit")){
					isStop = true;
					sendMessage(readLine); //sendMessage 만들어 놓은 거 있으니까 굳이 일일이 적을 필요 없음
				} else {
					broadCast(readLine); //arraylist에 있는 거 하나씩 꺼내서 보내주는 게 broadcast
				}
			}
			list.remove(this); //내 자신을 없앤다.
			System.out.println("클라이언트가 정상적으로 종료했습니다.....");
			
		} catch (IOException e) {
			list.remove(this); //내 자신을 없앤다.
			System.err.println("클라이언트가 비정상적으로 종료했습니다.....");
			
		}
	}
	
	public void broadCast(String message) throws IOException{
		for ( MulticastServerThread mst : list ){
			mst.sendMessage(message); // 얘도 또 던진다. 상위에 try catch 잡는 블럭이 있기 떄문이지.
		}
	}
	
	public void sendMessage(String message) throws IOException{ //왜 던졌냐? broadCast에서 메시지를 보낼거니까
		bw.write(message);
		bw.newLine();
		bw.flush();
	}
}
