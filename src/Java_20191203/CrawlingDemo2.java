package Java_20191203;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo2 {
	public static void main(String[] args) {
		String url = "https://sports.news.naver.com/index.nhn";
		// HTML 문서 전체를 관리하기 위한 객체
		Document doc = null;
		Document doc2 = null; //문서 만들고

		try {
			doc2 = Jsoup.connect(url).get(); // 사이트랑 문서랑 연결하기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//연결했다면 elements 뽑기 (title 없다)
		/*Elements elements = doc2.select("#news_category_contents_2_0"); // id는 # 으로 접근
		
		Elements liElements = elements.select("ul li"); // 전체 elements에서 ul li 뽑기. li가 여러 개라 elements로 받아 옴
		
		for(int i=0;i<liElements.size();i++){
			Element liElement = liElements.get(i);
			//기사 링크 타고 들어가서 기사 내용도 가져오기
			String href = liElement.select("a").attr("abs:href"); // "a" 태그 타고 들어가서, attr("abs..) : /뒤에 붙은 주소 그대로 가지고 올 떄 사용
			try {
				doc2 = Jsoup.connect(href).get();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Elements ele = doc2.select("#newsEndContents");
			String content = ele.text();
			String title = liElement.text();
			System.out.println(title+":"+content);
		}*/
	
	
		try {
			doc2 = Jsoup.connect(url).get(); // 사이트랑 문서랑 연결하기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//연결했다면 elements 뽑기 (title 없다)
		Elements elements = doc2.select(".newslst_grid_bx lst_type_text");
		Elements titleElements = elements.select("div");
		String noticeTitle = titleElements.text();
		System.out.println(noticeTitle);
		
		Elements liElements = elements.select("span"); 
		for(int i=0;i<liElements.size();i++){
			Element liElement = liElements.get(i);
			String text = liElement.text();
			System.out.println(text);
		}
	}
}
