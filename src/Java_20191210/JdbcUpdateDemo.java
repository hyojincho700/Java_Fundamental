package Java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이브로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn?autoReconnect=true", "acorn12", "acorn12");
			
			System.out.println("데이터베이스 연결 성공");
			
			StringBuffer sql = new StringBuffer();
			//sql.append("UPDATE dept SET dname = ? , loc = ? WHERE deptno = ?;");
			sql.append("UPDATE dept ");
			sql.append("SET dname = ?, loc = ? ");
			sql.append("WHERE deptno = ?"); //잘라서 넣을 때는 맨 마지막 문장 뺀 나머지 문장 마지막에 공백 있어야 함
			
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setString(1, "MININGS");
			pstmt.setString(2, "SLICON VALLEY");
			pstmt.setInt(3, 60);
			
			int result = pstmt.executeUpdate();
			System.out.println("업데이트 된 행의 수 : " + result);
			
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
