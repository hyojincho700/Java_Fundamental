package Java_20191211;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		boolean isSuccess = false;

		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/acorn", "acorn12", "acorn12");

			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES (50, 'aaa', 'aaa')");
			con.setAutoCommit(false); // 트랜잭션 시작

			pstmt1 = con.prepareStatement(sql.toString());
			pstmt1.executeUpdate();

			sql.setLength(0); // 기존 sql 문 지우기 (append, setLength 외우기)
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES (60, 'bbb', 'bbb')");

			pstmt2 = con.prepareStatement(sql.toString());
			pstmt2.executeUpdate();

			isSuccess = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (isSuccess == true) {
					con.commit(); //모두 수행
				} else {
					con.rollback(); //모두 수행하지 않음
				} //트랜젝션 끝
				con.setAutoCommit(true); // 트랜젝션 다 하면 원상복구. 
										 //connection pool을 사용하는 경우에는 반드시 써야 하는 코드. (자원반납)
				if (pstmt1 != null) pstmt1.close();
				if (pstmt2 != null) pstmt2.close();
				if (con != null) con.close();
			} catch (SQLException e) {

			}
		}

	}
}
