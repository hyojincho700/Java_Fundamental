package Java_20191202;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo4 {
	public static void main(String[] args) {
		//파일 생성 (directory 만들기) 이게 제일 중요!!!★
		//이런 건 메서드로 만들어 놓으면 좋아요
		File f1 = new File("c:\\dev\\io\\2019\\12");
		boolean isSuccess = f1.mkdir(); //디렉토리 하나 만들려면 mkdir, 두 개 이상 mkdirs
		System.out.println(isSuccess);
		
		
		//파일 크기 얻어오기★
		File f2 = new File(f1,"jdk-11.0.3_windows-x64_bin.exe");
		long fileSize = f2.length()/1024; 
		System.out.println(fileSize);
		long lastModified = f2.lastModified();
		
		Calendar c = Calendar.getInstance(); //왜 new 안합니까? 추상클래스라서요. 이건 calendar 클래스 객체 생성법.(무조건 만들어주어야 해요)
		//파일 마지막 수정된 날짜 얻어오기
		c.setTimeInMillis(lastModified);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		System.out.printf("%d년 %d월 %d일 %n",year,month,day);
		
		//이런 건 메서드로 만들어 놓으면 좋아요2222
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a hh:mm:ss E요일");
		String date = sdf.format(c.getTime());
		System.out.println(date);
		
		
		File f3 = new File("c:\\");
		//list() : c 드라이브에 있는 모든 파일과 디렉토리를 String[] 배열로 반환
		String[] list = f3.list();
		
		for(String temp : list){ //배열이니까 enhanced for문 이용
			File f4 = new File(f3,temp);
			if(f4.isDirectory()){
				System.out.println("디렉토리 : " + temp);
			}else if(f4.isFile()){
				System.out.println("파일 : " + temp);
			}else{
				System.out.println("? : " + temp);
			}
			System.out.println(temp);
		}
		
		
		//이름 바꾸기★
		File f5 = new File(f1,"jdk.exe"); //새로운 객체 생성
		f2.renameTo(f5); //f2를 f5에 설정한 것처럼 이름 바꾸자.
		
		
		//파일 생성...은 되는데 이건 사용하지 말자. 
		File f6 = new File(f1, "a.txt");
		try {
			f6.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //unhandle enception 발생 -> 예외처리 해주어야 함
		
		//파일객체 이름 끄집어 내기
		System.out.println(f6.getName());
		//파일 이름 포함 경로를 전부 
		System.out.println(f6.getPath());
		//부모 호출
		System.out.println(f6.getParent());
		
		// a.txt => 1235651387453.txt
		String extension = f6.getName().substring(f6.getName().lastIndexOf("."));
		System.out.println(extension);
		
		File f7 = new File(f1,System.currentTimeMillis()+".txt"); //이렇게만 하면 반쪽짜리 답. 확장자도 가지고 와야 한다.
		
		f6.renameTo(f7); //f7를 f6에 설정한 것처럼 이름 바꾸자.
		
		//삭제하기 ★
		f7.delete();
		
	}
}
