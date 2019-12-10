package Java_20191204.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	private String ip;
	private int port;

	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public void run() {
		Socket socket = null;
		OutputStream out = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			//Java-11.12p  3. 소켓객체를 생성한다.
			//             4. 서버와 연결을 한다.
			socket = new Socket(ip, port);
			//             6. 소켓으로 출력스트림을 생성한다. 
			out = socket.getOutputStream();
			//여기서부턴 IO 코딩. OutputStreamWriter를 이용해 1바이트를 2바이트로 바꿔준다.
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);
			bw.write("안녕하세요");
			bw.newLine(); //개행 필요
			bw.flush(); //buffered는 flush가 안되니까 따로 작성해주어야 함
			
			//9. 소켓으로 입력스트림을 생성한다.
			in = socket.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(out != null) out.close(); //out이 null이 아니면 out을 닫자
					if(osw != null) osw.close();
					if(bw != null) bw.close();
					if(in != null) in.close();
					if(isr != null) isr.close();
					if(br != null) br.close();
					if(socket != null) socket.close();
							
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	public static void main(String[] args) {
		new EchoClient("192.168.0.203", 3000).run();
	}
}
