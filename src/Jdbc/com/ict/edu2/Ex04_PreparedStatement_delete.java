package Jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex04_PreparedStatement_delete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 custid : ");
		int custid = scan.nextInt();
	
		
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##sanghwa";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 보토은 primary key를 이용해서 삭제한다. 
			String sql = "delete from CUSTID where  CUSTID = ?";
			// ? => 바인딩 변수 
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, custid);
			result = pstm.executeUpdate();
			if (result > 0) {
				sql = "select * from custid";
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\n");

			}
			}
		} catch (Exception e) {
			
		}finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
