package homework.salgrade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalInsertDemo {
	public static void main(String[] args) {
	
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn", "acorn12", "acorn12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO salgrade(grade, losal, hisal) VALUES(?, ?, ?)");
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 6);
			pstmt.setInt(2, 10000);
			pstmt.setInt(3, 10100);
			
			int result = pstmt.executeUpdate();
			System.out.println("갱신된 행의 개수 : " + result);
			
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
