package Java_20191204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws IOException {
		//url class 기능 1; url 구성요소 뽑기
		URL url = new URL("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=421&aid=0004340528");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String quary = url.getQuery();
		String ref = url.getRef();
		System.out.printf("Protocol : %s%n",protocol);
		System.out.printf("Host : %s%n",host);
		System.out.printf("Port : %d%n",port);
		System.out.printf("Path : %s%n",path);
		System.out.printf("Quary : %s%n",quary);
		System.out.printf("Ref : %s%n",ref);
		
		//url class 기능 2; url에 있는 정보를 전부 가져옴
		InputStream in = url.openStream(); 
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		String readLine = null;
		while((readLine = br.readLine()) != null){
			System.out.println(readLine);
		}
		
		}
}
