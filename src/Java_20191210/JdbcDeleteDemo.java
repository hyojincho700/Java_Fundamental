package Java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
		
		try {
			// 1. 메모리 연결
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
	
		try {
			// 2. 데이터베이스와 연결
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn?autoReconnet=true","acorn12","acorn12");
			
			// 3. preparedStatement 객체를 생성
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE "); 
			sql.append("FROM dept "); 
			sql.append("WHERE deptno = ?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			// 4. 바인딩 변수를 설정한다.
			pstmt.setInt(1, 60);
			
			// 5. SQL 문을 데이터베이스에 전송한다.
			int result = pstmt.executeUpdate();
			System.out.println("삭제된 행의 수 : " + result);
			
			
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
