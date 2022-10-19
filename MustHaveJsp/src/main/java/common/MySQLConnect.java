package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnect {
	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	// 기본 생성자
	public MySQLConnect() {
		try {
			//mySQL 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/user";
		    String username = "root";
		    String password = "pw1234";

		    con = DriverManager.getConnection(url, username, password);
		    
		    System.out.println("DB 연결 성공!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//연결 해제(자원 반납)
	public void close() {
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
			if(stmt != null) stmt.close();
			if(rs != null) rs.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
