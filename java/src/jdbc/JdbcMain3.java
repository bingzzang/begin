package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class JdbcMain3 {
	
	String url = "jdbc:oracle:thin:@localhost:1521:orcl"; //주소:포트/db명
	String id = "bing";	//계정명
	String pw = "bing";	//비밀번호

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	JdbcMain3(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String sql = "select * from testdb";
			con = DriverManager.getConnection(url, id, pw);

			try {
				ps = con.prepareStatement(sql);
				
				try {
					rs = ps.executeQuery();
					try {
						System.out.println("번호\t이름\t날짜\t");
						System.out.println("--------------------");
						
						while(rs.next()) {
							int no = rs.getInt(1);
							String name = rs.getString(2);
							Date date = rs.getDate(3);
							
							
							System.out.println(no+"\t"+name+"\t"+date);
						}
					}catch(Exception e) {
						System.out.println("파싱오류 : "+e);
					}finally {
						rs.close();
					}
				}catch(Exception e) {
					System.out.println("rs 쿼리오류 : "+e );
				}finally {
					ps.close();
				}
			}catch(Exception e){
				System.out.println("statement 오류 : "+e);
			}finally {
				con.close();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("no driver");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new JdbcMain3();
	}
}
