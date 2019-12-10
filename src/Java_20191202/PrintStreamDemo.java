package Java_20191202;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		PrintStream ps = System.out; // Destination을 출력장치로 연결하겠다는 의미
		ps.println("Hello World!!");

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps1 = null;

		try {
			fis = new FileInputStream("C:\\dev\\io\\2019\\12\\pdf.zip");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("C:\\dev\\io\\2019\\12\\pdf-copy.zip");
			bos = new BufferedOutputStream(fos);

			ps1 = new PrintStream(bos, true); //  프린트 스트림은 파일로 연결하지 않는다. 시간이 너무 오래 걸림.
			int readByte = 0;
			while ((readByte = bis.read()) != -1) {
				ps1.write(readByte);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 닫을 떄는 안쪽부터 천천히!
			try {
				if (fis != null)
					fis.close(); // 객체가 생성이 됐으면 닫고 그렇지 않으면 닫지 말아라
				if (bis != null)
					bis.close();
				if (ps1 != null)
					ps1.close();
				if (fos != null)
					fos.close();
				if (bos != null)
					bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
