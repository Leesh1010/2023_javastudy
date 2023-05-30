package Jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05_Statment_select {
	public static void main(String[] args) {
		// 접속하고 처리하기 위해서 3개의 클래스 
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##sanghwa";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 이름이 이강인 삭제
			String sql = "delete from CUSTID where name = '이강인'";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
					if (result>0) {
						sql = "select * form custid order by custid asc";
						rs = stmt.executeQuery(sql);
						while (rs.next()) {
							System.out.print(rs.getString("CUSTID")+"\t");
							System.out.print(rs.getString("NAME")+"\t");
							System.out.print(rs.getString("ADDRESS")+"\t");
							System.out.print(rs.getString("PHONE")+"\n");
						}
					}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
