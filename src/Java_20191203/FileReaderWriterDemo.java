package Java_20191203;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("C:\\dev\\io\\2019\\12\\test.txt");
			fw = new FileWriter("C:\\dev\\io\\2019\\12\\test-copy.txt");
			
			//표준 출력장치에 출력. 한 코드 읽고 쓰기★
     		/*int readChar = 0;
			while((readChar = fr.read()) != -1){ //한 문자 읽고 저장
				System.out.print((char)readChar); 
				//파일(test-copy.txt)에 출력
				fw.write(readChar); //char write
			}*/
			
			//배열 읽고 쓰기★
			char[] readChars = new char[10];
			int readCharCount =0;
			while((readCharCount = fr.read(readChars)) != -1){
				System.out.print(new String(readChars, 0, readCharCount)); //배열을 문자열로 출력하는 방법. new 이용, 읽은 수만큼 출력시키기
				fw.write(readChars, 0, readCharCount); //char[] write
				//fw.write(new String(readChars, 0, readCharCount)); // 문자열 write (이것보단 30라인 코드 쓰자)
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { //하나씩 닫아주기
				try {
					if(fr != null) fr.close();
					if(fw != null) fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	} 
}
