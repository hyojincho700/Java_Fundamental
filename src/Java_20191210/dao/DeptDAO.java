package Java_20191210.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Java_20191210.dto.DeptDTO;

public class DeptDAO {
	// static 초기화로 드라이브로드
	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 1 singleton pattern
	//single 변수는 static 메서드에서 사용해야 하기 때문에 static 변수로 설정해야 한다.
	private static DeptDAO single;
	
	// 외부에서 객체를 생성할 수 없다.
	private  DeptDAO() {
	}

	//외부에서 DeptDAO 객체를 생성하기 위해서는 getInstance() 메서드를 이용해야 한다.
	//따라서 이 메서드에서는 DeptDAO 객체를 하나만 생성할 수 있게 코딩해야 한다. (Singleton)
	public static  DeptDAO getInstance() {
		if (single == null) {
			single = new DeptDAO();
		}
		return single;
	}

	public boolean insert(DeptDTO dto) {
		boolean isSuccess = false;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", "acorn12",
					"acorn12");

			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept (deptno, dname, loc) VALUES (?, ?, ?);");

			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, dto.getNo());
			pstmt.setString(++index, dto.getName());
			pstmt.setString(++index, dto.getLoc());

			pstmt.executeUpdate();

			isSuccess = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return isSuccess;
	}

	public boolean update(DeptDTO dto) {
		boolean isSuccess = false;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", "acorn12",
					"acorn12");

			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE dept ");
			sql.append("SET dname = ?, loc = ? ");
			sql.append("WHERE deptno = ?");

			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setString(++index, dto.getName());
			pstmt.setString(++index, dto.getLoc());
			pstmt.setInt(++index, dto.getNo());
		
			pstmt.executeUpdate();

			isSuccess = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return isSuccess;

	}

	public boolean delete(int deptno) {
		boolean isSuccess = false;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn?autoReconnet=true", "acorn12", "acorn12");

			StringBuffer sql = new StringBuffer();
			sql.append("DELETE ");
			sql.append("FROM dept ");
			sql.append("WHERE deptno = ?");

			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, deptno);

			pstmt.executeUpdate();

			isSuccess = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isSuccess;
	}

	// select 다 가져오는 경우
	public ArrayList<DeptDTO> select() {
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn", "acorn12", "acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT deptno, dname, loc ");
			sql.append("FROM dept ");
			sql.append("ORDER BY deptno");

			pstmt = con.prepareStatement(sql.toString());

			rs = pstmt.executeQuery(); // select문일 때 SQL문을 전송하는 메서드

			while (rs.next()) {
				int index = 1;
				int deptno = rs.getInt(index++);
				String dname = rs.getString(index++);
				String loc = rs.getString(index++);
				list.add(new DeptDTO(deptno, dname, loc));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;

	}

	// select 하나 가져오는 경우 : primary key로 가져올 경우
	public DeptDTO select(int deptNo) {
		DeptDTO dto = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn", "acorn12", "acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT deptno, dname, loc ");
			sql.append("FROM dept ");
			sql.append("where deptno = ?");

			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, deptNo);

			rs = pstmt.executeQuery(); // select문일 때 SQL문을 전송하는 메서드

			if (rs.next()) {
				index = 1;
				int deptno = rs.getInt(index++);
				String dname = rs.getString(index++);
				String loc = rs.getString(index++);
				dto = new DeptDTO(deptno, dname, loc);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return dto;
	}
}
