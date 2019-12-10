package Java_20191128;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManagementDemo2 {
	private ArrayList<Member> list; // 멤버를 담는 객체 생성

	public MemberManagementDemo2() { // 생성자는 멤버 변수를 초기화 해 줍니다.
		list = new ArrayList<Member>();
	}

	public void print() {
		System.out.println("********************************************");
		System.out.println("*1)insert 2)update 3)delete 4)search 5)exit*");
		System.out.println("********************************************");
	}

	public String console(String msg) {
		System.out.print(msg); // console을 호출하면 "번호를 선택하세요" 출력
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	public void run(String index){
		if(index.equals("1")){
			insert();
		}else if(index.equals("2")){
			update();
		}else if(index.equals("3")){
			delete();
	    }else if(index.equals("4")){
	    	search();
	    }else if(index.equals("5")){
	    	System.out.println("프로그램 종료");
	    }else{
	    	System.out.println("사요나라!!!");
	    }
	}	
	//1. 아이디를 입력받는다.
	//2. 이름을 입력받는다.
	//3. ArrayList에 멤버를 추가한다.
	//4. print()메서드를 호출하여 번호를 선택할 수 있게 한다.
	//5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 대기한다.
	//6. 번호를 입력 받으면 run() 메서드를 호출한다.
	public void insert(){
		String id = console("아이디>"); //아이디 입력받는 거.. 콘솔메서드 : 키보드 값 입력 대기하는 메서드
		String name = console("이름>");
		
		Member m = new Member(id, name); //아이디랑 이름을 변수로 받는 맴버 객체를 만든다.
		list.add(m); //list에 add 해주면 끝!
		
		System.out.printf("총 회원은 %d명입니다.%n", list.size());
		
		//번호선택하는거~
		print(); //print 메서드 호출
		String index = console("번호를 선택하세요>"); 
		run(index); //run 메서드에 인덱스 넣어주기.
	}
	
	//1. 수정할 아이디를 입력받는다.
	//2. ArrayList에 있는 멤버중에서 수정할 아이디를 찾아서 있으면 수정할 이름을 입력받고, ArrayList에
	//   멤버정보를 수정하고 만약 없으면 "수정할 아이디가 없습니다." 라는 메세지를 출력한다.
	//3. ArrayList에 있는 멤버정보를 모두 출력한다.
	//4. print()메서드를 호출하여 번호를 선택할 수 있게 한다.
	//5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 대기한다.
	//6. 번호를 입력 받으면 run() 메서드를 호출한다.
	public void update(){
		String id = console("아이디>");
		
		System.out.printf("총 회원은 %d명입니다.%n", list.size());
		
		//번호선택하는거~
		print(); //print 메서드 호출
		String index = console("번호를 선택하세요>"); 
		run(index); //run 메서드에 인덱스 넣어주기.
		
	}
	
	//1. 삭제할 아이디를 입력받는다.
	//2. ArrayList에 있는 멤버중에서 삭제할 아이디를 찾아서 있으면 삭제할 이름을 입력받고, ArrayList에
	//   멤버정보를 삭제하고 만약 없으면 "삭제할 아이디가 없습니다." 라는 메세지를 출력한다.
	//3. ArrayList에 있는 멤버정보를 모두 출력한다.
	//4. print()메서드를 호출하여 번호를 선택할 수 있게 한다.
	//5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 대기한다.
	//6. 번호를 입력 받으면 run() 메서드를 호출한다.
	public void delete(){
		String id = console("아이디>");
		
		for(int i=0;i<list.size();i++){
			list.remove(i--);
		}
		
		
        System.out.printf("총 회원은 %d명입니다.%n", list.size());
		
		//번호선택하는거~
		print(); //print 메서드 호출
		String index = console("번호를 선택하세요>"); 
		run(index); //run 메서드에 인덱스 넣어주기.
		
	}
	
	//1. 검색할 아이디를 입력받는다.
	//2. ArrayList에 있는 멤버중에서 검색할 아이디를 찾아서 있으면 검색할 이름을 입력받고, ArrayList에
	//   멤버정보를 출력하고 만약 없으면 "검색된 결과가 없습니다." 라는 메세지를 출력한다.
	//3. print()메서드를 호출하여 번호를 선택할 수 있게 한다.
	//4. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 대기한다.
	//5. 번호를 입력 받으면 run() 메서드를 호출한다.
	public void search(){
		String id = console("아이디>"); //검색할 아이디 입력
		
		ArrayList<Member> list = new ArrayList<Member>();
		
		
		
		
		//번호선택하는거~
		print(); //print 메서드 호출
		String index = console("번호를 선택하세요>"); 
		run(index); //run 메서드에 인덱스 넣어주기.
		
	}
	
	
	
	
	


	public static void main(String[] args) {
		MemberManagementDemo m1 = new MemberManagementDemo();
		m1.print();
		String index = m1.console("번호를 선택하세요>");
		m1.run(index);
	}
}