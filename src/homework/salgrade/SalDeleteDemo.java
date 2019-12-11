package homework.salgrade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalDeleteDemo {
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
			sql.append("DELETE ");
			sql.append("from salgrade ");
			sql.append("WHERE grade = ?");
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 6);
			
			int result = pstmt.executeUpdate();
			System.out.println("삭제된 행의 개수 : " + result);
			
			
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
