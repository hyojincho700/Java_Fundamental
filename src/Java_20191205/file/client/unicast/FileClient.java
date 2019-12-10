package Java_20191205.file.client.unicast;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {
	private String ip;
	private int port;

	public FileClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public void run() {
		try {
			Socket socket = new Socket(ip, port);
			String fileName = "mariadb.pdf";
			// outputstream 만들기
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write(fileName);
			bw.newLine();
			bw.flush();

			InputStream in = socket.getInputStream(); // 소켓으로 읽어야 함
			FileOutputStream fos = new FileOutputStream("C:\\dev\\io\\" + fileName);// 로컬에
																					// 출력
																					// ->
																					// fileOutputStream

			// 바이트배열로 서버에서 보내니까 얘도 바이트배열로 코딩해주어야 함
			byte[] readBytes = new byte[1024 * 8];
			int readByteCount = 0;

			while ((readByteCount = in.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileClient("192.168.0.214", 3033).run();
	}
}
