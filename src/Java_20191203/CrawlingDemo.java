package Java_20191203;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {
	public static void main(String[] args) {
		String url = "http://www.imbc.com/";
		// HTML 문서 전체를 관리하기 위한 객체
		Document doc = null; //문서 만들고

		try {
			doc = Jsoup.connect(url).get(); // 사이트랑 문서랑 연결하기
			System.out.println("성공"); // 잘 연결했다면 성공이 뜰거임
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//연결했다면 공지사항 elements 뽑기
		Elements elements = doc.select(".con-wrap.notice-wrap"); //명칭이 클래스여서 맨 앞에 . 을 붙여 접근. select로 찾아 들어가기
		Elements titleElements = elements.select("h3");
		String noticeTitle = titleElements.text();
		System.out.println(noticeTitle);
		
		Elements liElements = elements.select("ul li"); // 전체 elements에서 ul li 뽑기. li가 여러 개라 elements로 받아 옴
		//li 가 여러 개라 for loop로 돌려서 다 가져옴
		for(int i=0;i<liElements.size();i++){
			Element liElement = liElements.get(i);
			String text = liElement.text();
			System.out.println(text);
		}
	}
}
