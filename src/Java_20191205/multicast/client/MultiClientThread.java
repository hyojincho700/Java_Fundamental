package Java_20191205.multicast.client;

import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.JTextArea;

public class MultiClientThread implements Runnable {
	private BufferedReader br;
	private JTextArea jta;
	public MultiClientThread(BufferedReader br, JTextArea jta) {
		// TODO Auto-generated constructor stub
		this.br = br; //여기에 선언된 변수는 아래 run() 메소드에서 사용하기 위함
		this.jta = jta;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//계속 읽어서 jtextarea에 찍어주는 역할
		while(true){ 
			try {
				String readLine = br.readLine(); //읽고
								
				if(readLine.equals("exit")){ //끝내고
					System.exit(0);
				}else{ 
					jta.append(readLine+"\n"); //찍어주기
					jta.setCaretPosition(jta.getDocument().getLength()); //caret : 커서
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
