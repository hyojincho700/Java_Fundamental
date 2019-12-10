package Java_20191203;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarketCapCrawlingDemo {

	public static void main(String[] args) {
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20171101&end=20191203";		
		Document doc = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		Elements elements = doc.select(".cmc-table__table-wrapper-outer table tbody tr"); //모니터 출력
		System.out.println("Date\t\tOpen\tHigh\tLow\tClose\tVolume\tCap"); // 항목 출력
		
		
		try {
			//파일출력법 (40-42 고정)
			fw = new FileWriter("C:\\dev\\io\\2019\\12\\crawling.txt"); //파일 출력
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);
			pw.println("Date\t\tOpen\tHigh\tLow\tClose\tVolume\tCap");
			
			//C:\dev\io\2019\12\crawling.txt로 저장
			for(int i=0;i<elements.size();i++){
				Element trElement = elements.get(i);
				String date = trElement.child(0).text(); 
				String open = trElement.child(1).text(); 
				String high = trElement.child(2).text(); 
				String low = trElement.child(3).text(); 
				String close = trElement.child(4).text(); 
				String volume = trElement.child(5).text(); 
				String cap = trElement.child(6).text();  
				
				String format = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s%n",date,open,high,low,close,volume,cap);
				System.out.print(format); //모니터 출력
				pw.print(format); //파일 출력
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pw != null) pw.close();
		}
			
	}
}
