package Java_20191203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class NaverScaningDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.naver.com/");
		InputStream in = url.openStream(); //in 에 네이버 url이 쫙 들어가 있습니다.
		InputStreamReader ir = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
			
		//네이버 소스 가져오는 코드 (24~37라인은 항상 일정하다. 정형화 된 코드)
		//1. InputStream을 InputStreamReader로 스트림 체이닝한다. (1~2번 : 1->2바이트 바꾸는 과정)
		ir = new InputStreamReader(in);
		//2. InputStreamReader를 BufferedReader로 스트림 체이닝한다.
		br = new BufferedReader(ir);
		//3. BufferedReader로 읽은 정보(HTML)를 C:\dev\io\12\naver.html 파일로 저장(쓰기. 읽기x)한다.
		
		fw = new FileWriter("C:\\dev\\io\\2019\\12\\naver.html");
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw,true);
		
	   	String readLine = null;
		while((readLine = br.readLine()) != null){
			//System.out.println(readLine);
			pw.println(readLine);
		}
		
		if(in != null) in.close();
		if(br != null) br.close();
	}
}
