package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class JdbcMain4 {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "bing";
	String pw = "bing";
	
	int no;
	String name;
	Date rdate;
	
	JdbcMain4(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("연결 성공");
		}catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		}catch(SQLException se) {
			System.out.println(se);
		}
	}
	
	void insert() {
		String sql = "insert into testdb values(?, ?, sysdate)";
		
		try {
			System.out.println("번호 입력");
			System.out.print("> ");
			no = Integer.parseInt(br.readLine());
			
			System.out.println("이름 입력");
			System.out.print("> ");
			name = br.readLine();
			
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			ps.setString(2, name);
			
			ps.executeUpdate();
			System.out.println("입력 성공");
		}catch(IOException ie) {
			System.out.println("입력 에러 :" +ie);
		}catch(Exception e) {
			System.out.println("insert error : "+e);
		}
	}
	
	void update() {
		System.out.println("바꾸고 싶은 것");
		System.out.println("A. 번호\tB.이름");
		String sql = null;
		
		try {
			String choice = br.readLine();
			if(choice.equalsIgnoreCase("A")) {
				sql = "update testdb set no = ?, rdate = sysdate where name=?";
				try {
					System.out.println("바꿀 번호의 이름");
					System.out.print(">");
					name = br.readLine();
					
					System.out.println("새 번호");
					System.out.print(">");
					no = Integer.parseInt(br.readLine());
					
					ps = con.prepareStatement(sql);
					ps.setInt(1, no);
					ps.setString(2, name);
					ps.executeUpdate();
					System.out.println("번호 수정 성공");
				}catch(Exception e) {
					System.out.println("a 수정 오류 : "+e);
				}
			}else if(choice.equalsIgnoreCase("B")) {
				sql = "update testdb set name = ?, rdate = sysdate where no=?";
				try {
					System.out.println("바꿀 이름의 번호");
					System.out.print(">");
					no = Integer.parseInt(br.readLine());
					
					System.out.println("새 이름");
					System.out.print(">");
					name = br.readLine();
					
					ps = con.prepareStatement(sql);
					ps.setString(1, name);
					ps.setInt(2, no);
					ps.executeUpdate();
					System.out.println("이름 수정 성공");
				}catch(Exception e) {
					System.out.println("b 수정 오류 : "+e);
				}
			}else {
				System.out.println("수정 입력 오류");
				update();
			}
		}catch(IOException ie) {
			System.out.println("수정입력 오류 :"+ ie);
		}
		
	}
	
	void delete() {
		System.out.println("삭제하고 싶은 번호");
		System.out.print(">");
		try {
			no = Integer.parseInt(br.readLine());
			String sql = "delete from testdb where no=?";
			try {
				ps = con.prepareStatement(sql);
				ps.setInt(1, no);
				ps.executeUpdate();
				System.out.println("삭제 성공");
			}catch(Exception e) {
				System.out.println("삭제 오류 :" +e);
			}
		}catch(IOException ie) {
			System.out.println("삭제입력오류 : "+ ie);
		}
		
	}
	
	void select() {
		try {
			String sql = "select * from testdb";
			ps = con.prepareStatement(sql);
			try {
				rs = ps.executeQuery();
				try {
					System.out.println("번호\t이름\t날짜\t");
					System.out.println("--------------------");
					
					while(rs.next()) {
						no = rs.getInt(1);
						name = rs.getString(2);
						rdate = rs.getDate(3);
						
						System.out.println(no+"\t"+name+"\t"+rdate);
					}
				}catch(Exception e) {
					System.out.println("파싱오류 : "+e);
				}finally {
					rs.close();
				}
			}catch(Exception e) {
				System.out.println("rs 오류 : "+e);
			}
		}catch(Exception e) {
			System.out.println("조회 오류 : "+ e);
		}
	}
	
	void allClose() {
		try{
			if(ps != null) ps.close();
			if(con != null) con.close();
		}catch(SQLException se){
			System.out.println("close에러 : "+se);
		}
	}
	public static void main(String[] args) {
		JdbcMain4 jm = new JdbcMain4();

//		jm.insert();
		
//		jm.update();

//		jm.delete();
		
		jm.select();
		
		jm.allClose();
	}

}
