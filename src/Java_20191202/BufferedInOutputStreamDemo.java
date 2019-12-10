package Java_20191202;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("C:\\dev\\io\\2019\\12\\pdf.zip");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("C:\\dev\\io\\2019\\12\\pdf-copy.zip");
			bos = new BufferedOutputStream(fos);

			try {

				/*int readByte = 0;
				long start = System.currentTimeMillis();

				while ((readByte = bis.read()) != -1) {
					bos.write(readByte);
				}
				
				bos.flush();
				
				long end = System.currentTimeMillis();

				System.out.printf("경과시간: %d%n", end - start);
				*/
				
				int readByteCount = 0;
				byte[] readBytes = new byte[1024*8];
				long start = System.currentTimeMillis();
				while((readByteCount = fis.read(readBytes)) != -1){
					fos.write(readBytes,0,readByteCount);
				}
				
				long end = System.currentTimeMillis();
				
				System.out.printf("경과시간 : %d%n", end-start);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				//닫을 떄는 안쪽부터 천천히!
				try {
					if(fis != null) fis.close(); //객체가 생성이 됐으면 닫고 그렇지 않으면 닫지 말아라
					if(bis != null) bis.close();
					if(fos != null) fos.close();
					if(bos != null) bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
