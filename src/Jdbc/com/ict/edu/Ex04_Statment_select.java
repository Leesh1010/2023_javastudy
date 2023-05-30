package Jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// insert
public class Ex04_Statment_select {
	public static void main(String[] args) {
		// 접속과 처리를 위한 클래스 3개
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
			
			// insert (6번, 이강인, 대한민국 서울, 000-9000-0001) 추가
			String sql = "insert into CUSTID (CUSTID,name,address,phone) " 
					+ " values(10,'이강인','대한민국 서울','010-9000-0001)";
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(sql);
			
			if(result>0) {
				//성공하면 select문을 이용해서 보자
				sql = "select * form custid order by custid asc";
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getString("CUSTID")+"\t");
					System.out.print(rs.getString("NAME")+"\t");
					System.out.print(rs.getString("ADDRESS")+"\t");
					System.out.print(rs.getString("PHONE")+"\n");
				}
			}else {
				System.out.println(" 제대로 된 데이터를 입력 하세요");
			}
		} catch (Exception e) {
	
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}
}
