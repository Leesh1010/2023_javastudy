package Jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// customr  테이블에서 박씨 성을 가진 사람의 모든 정보를 검색하자. 
public class Ex03_Statment_select {
	public static void main(String[] args) {
		// 1. 자바를 오라클에 접속 할 수 있도록 도와주는 클래스
		Connection conn = null;
		// 2. SQL 구문 작성을 도와주는 클래스
		Statement stmt = null;
		// 3-1. select 문의 결과를 받는 클래스
		ResultSet rs = null;
		// 3-2. select 문을 제외한 결과를 받는 변수
		int result = 0;
		
		// 4. jdbc 드라이버 로딩 : 오라클, MySQL 등 각 내용이 다르다.
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 5. 접속하기 위한 정보 저장
			//   오라클, MySQL 각 내용이 다르다.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##sanghwa";
			String password = "1111";
			
			// 6. 잡속하기 
			conn = DriverManager.getConnection(url, user, password);
			
			// 7. SQL 작성하기
			String sql = "SELECT * FROM CUSTID where name like '박%'";
			
			// 8. SQL을 보낼 수 있는 구문 만들기
			stmt = conn.createStatement();
			
			// 9. SQL을 담아서 보내고 결과 받기 
			
			// 9-1. SELECT 일때
			rs = stmt.executeQuery(sql);
			// 9-2. SELECT 아닐때 
			// result = stmt.executeUpdate(sql);
			
			while (rs.next()) {
				System.out.print(rs.getString("CUSTID")+"\t");
				System.out.print(rs.getString("NAME")+"\t");
				System.out.print(rs.getString("ADDRESS")+"\t");
				System.out.print(rs.getString("PHONE")+"\n");
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
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


