package Jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex02_PreparedStatement_select {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("CUSTID : ");
		int CUSTID = scan.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##sanghwa";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from CUSTID where CUSTID = ?";
			// ? => 바인딩 변수 
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, CUSTID);
			rs = pstm.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t");
				System.out.println(rs.getString(2)+"\t");
				System.out.println(rs.getString(3)+"\t");
				System.out.println(rs.getString(4)+"\t");

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
