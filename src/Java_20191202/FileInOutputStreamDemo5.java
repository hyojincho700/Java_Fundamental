package Java_20191202;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutputStreamDemo5 {
	public static void main(String[] args) {
		//객체 생성
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//읽고 쓰고 (한 바이트씩)
		try {
			fis = new FileInputStream("C:\\dev\\io\\2019\\12\\jdk.exe");
			fos = new FileOutputStream("C:\\dev\\io\\2019\\12\\jdk-2.exe");
			//19-23 : 이게 핵심 코드. 이 것만 기억해도 성공
			//int readByte = 0;
			//fis.read() : 한 바이트 읽어서 반환한다. 더 이상 읽을 바이트가 없으면 -1 반환
			//while((readByte = fis.read()) != -1){
				//fos.write() : 한 바이트 쓰기
				//fos.write(readByte);
			//}
			
			
			//읽고 쓰고 (1024 바이트씩).[]안에 1024*숫자 넣으면 됨
			byte[] readBytes = new byte[1024*10]; // 8-10KB
			int readByteCount = 0;
			//fis.read(readBytes) : 1024 바이트 읽어서 readBytes에 저장하고 
			//읽은 바이트수를 반환한다.
			long start = System.currentTimeMillis();
			while((readByteCount = fis.read(readBytes)) != -1){
				//fos.write(readBytes,0,readByteCount) : readBytes 바이트 배열에 있는 
				//데이터를 출력하되, 처음(0)부터, readByteCount만큼 출력
				fos.write(readBytes,0,readByteCount);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d",end-start);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { //닫고
			try {
				if(fis != null) fis.close(); //fis가 객체를 생성하면 close
				if(fos != null) fos.close(); //fos가 객체를 생성하면 close
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
