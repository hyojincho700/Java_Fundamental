package Java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1. org.mariadb.jdbc.Driver 클래스를 메모리에 로딩한다.
			Class.forName("org.mariadb.jdbc.Driver"); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 2. 데이터베이스와 연결을 시도한다.
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", //url. 3306은 옵션
				  "acorn12", //user
				  "acorn12"); //password
			
			System.out.println("데이터베이스 연결 성공");
			
			StringBuffer sql = new StringBuffer(); //string으로 생성하면 객체가 계속 만들어지니까 메모리.. 아까움 StringBuffer로.
			sql.append("INSERT INTO dept (deptno, dname, loc) VALUES (?, ?, ?);"); //HEIDISQL 에서 확인한 다음에 넣기
																				   //(? : 바인딩 변수 - value 자리에만 넣을 수 있다)
			// 3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성한다.			
			pstmt = con.prepareStatement(sql.toString());
			
			// 4. 바인딩 변수(?) 세팅 : append 안 values ? 개수 만큼 각각의 자료형에 맞게 값 설정해주기
			pstmt.setInt(1, 60);
			pstmt.setString(2, "ANALYSIS");
			pstmt.setString(3, "LA");
			
			
			// 5. SQL문을 전송한다.
			//int result = pstmt.executeUpdate(); //insert, update, delete (DML) 일 떄 executeUpdate() 사용, result : 갱신된 행의 수
			//System.out.println("갱신된 행의 수 : " + result);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	} 

}
