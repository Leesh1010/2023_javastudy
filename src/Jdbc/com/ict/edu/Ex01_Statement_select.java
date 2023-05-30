package Jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//1. 자바와 오라클을 연결하기 위해서 드라이버에 ojdbc8.jar를 다운받고 util에 넣었다.
//2. 프로젝트와 ojdbc8.jar를 등록하자.
//- 등록방법 : 프로젝트에서 마우스 오른쪽 - Build Path - configure ~ - 
//3. 
public class Ex01_Statement_select {
	public static void main(String[] args) {
		// 1. 자바를 오라클에 접속할 수 있도록 도와주는 클래스
		Connection conn = null;
		// 2. SQL 구문 작성을 도와주는 클래스
		Statement stmt = null;
		// 3-1. SELECT 문의 결과를 받는 클래스 
		ResultSet rs = null;
		// 3-2. SELECT 문을 제외한(DELETE, UPDATE, INSERT) 결과를 받는 변수
		int result = 0;
		
		// 4. JDBC 드라이버 로딩 : 오라클, MySQL 등 각각 내용이 다르다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//5. 접속하기 위한 정보 저장
			//	 오라클, MySQL,각 내용이 다르다.
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##sanghwa";
			String password ="1111";
			
			// 6. 접속하기
			conn = DriverManager.getConnection(url, user, password);
			
			// 7. SQL 작성하기
			String sql = "SELECT * FROM 고객테이블";
			
			// 8. SQL을 보낼 수 있는 구문 만들기
			stmt = conn.createStatement();
			
			// 9. SQL을 담아서 보내고 결과 받기
			// 9-1. SELECT 일 때
			rs = stmt.executeQuery(sql);
			
			// 9-2. SELECT 아닐때
			// result = stmt.executeUpdate(sql);
			
			// 
			while (rs.next()) {
//				System.out.print(rs.getString(1)+"\t");
//				System.out.print(rs.getString(2)+"\t");
//				System.out.print(rs.getString(3)+"\t");
//				System.out.print(rs.getString(4)+"\t");
//				System.out.print(rs.getString(5)+"\t");
//				System.out.print(rs.getString(6)+"\n");
				
				System.out.print(rs.getString("고객아이디")+"\t");
				System.out.print(rs.getString("고객이름")+"\t");
				System.out.print(rs.getString("나이")+"\t");
				System.out.print(rs.getString("등급")+"\t");
				System.out.print(rs.getString("직업")+"\t");
				System.out.print(rs.getString("적립금")+"\n");
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
