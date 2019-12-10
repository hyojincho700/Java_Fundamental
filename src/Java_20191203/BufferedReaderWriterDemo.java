package Java_20191203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("C:\\dev\\io\\2019\\12\\test.txt");
			br = new BufferedReader(fr); // stream chainning
			
			fw = new FileWriter("C:\\dev\\io\\2019\\12\\test-copy2.txt");
			bw = new BufferedWriter(fw);
			
			String readLine = null; // 한 줄을 읽어야 하니까 (readline은 개행이 포함되지 않음->개행 넣어주어야 함)
			while((readLine = br.readLine()) != null){ //더 이상 읽을 게 없으면 그만해
				bw.write(readLine);
				bw.newLine(); // 개행 넣어주는 거. 여기선 이 코드가 제일 중요★
			}
			bw.flush(); //buffered로 되어있는 건 잘 읽히든 아니든 마지막에 flush를 넣어줍시다.
				
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { 
			
			  try {
					if(fr != null) fr.close();
					if(br != null) br.close();
					//if(fw != null) fw.close();
					if(bw != null) bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
		
	}
}
