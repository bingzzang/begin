package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class JdbcMain2 {
	
	public static final int YES = 1;
	public static final int NO = 0;
	public static final int EXCEP = -1;

	String tblname = "TESTDB";
	
	String url = "jdbc:oracle:thin:@localhost:1521:java";
	
	Connection con;
	Statement stmt;
	
	JdbcMain2(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(url, "bing", "930303");
			stmt = con.createStatement();
		} catch (ClassNotFoundException cnfe) {
			// TODO: handle exception
		} catch (SQLException se) {
			
		}
	}
	
	//테이블이 존재하는지
	int isTable(){ // 1:존재, 0:존재x, -1:예외
		String sql = "select * from tab where tblname ='"+tblname+"'";
		ResultSet rs = null;
		
		try {
			rs = stmt.executeQuery(sql);
			if(rs.next()) return YES;
			else return NO;
		}catch(SQLException se) {
			return EXCEP;
		}
	}
	
	void createtbl() {
		String sql = "create table "+tblname+"(NO number(4), NAME varchar2(10), RDATE date)";
		
		try {
			stmt.execute(sql);
			System.out.println(tblname+" 테이블 생성 완료");
		} catch (SQLException se) {
			// TODO: handle exception
		}
	}
	
	void droptbl() {
		String sql = "drop table "+tblname;
		String purge = "purge recyclebin";
		
		try {
			stmt.execute(sql);
			stmt.execute(purge);
			System.out.println(tblname +" 테이블 삭제 완료");
		}catch(SQLException se) {
			System.out.println("drop table : "+se);
		}
	}
	
	void insert(int no, String name) {
		String sql = "insert into "+tblname +" values("+no+", '"+name+"', SYSDATE)";
		
		try {
			int i = stmt.executeUpdate(sql);
			
			if(i>0) System.out.println("입력 성공");
			else System.out.println("입력 실패");
		}catch(SQLException se) {
			System.out.println("입력 실패 : "+se);
		}
	}
	
	void update(int no, String name) {
		String sql = "update "+tblname+ " set NAME='"+name+"' where NO="+no;
		
		try {
			int i = stmt.executeUpdate(sql);
			if(i>0) System.out.println("수정 성공");
			else System.out.println("수정 실패");
		}catch(SQLException se) {
			System.out.println("수정 실패 :"+se);
		}
	}
	
	void delete(int no){ //DML
		String sql = "delete from " + tblname + " where NO="+no;
		try{
			int i = stmt.executeUpdate(sql);
			if(i>0) System.out.println("삭제 성공");
			else System.out.println("삭제 실패");
		}catch(SQLException se){
			System.out.println("삭제 실패" + se);
		}
	}
	void delete(String name){ //DML
		String sql = "delete from " + tblname + " where NAME='"+name+"'";
		try{
			int i = stmt.executeUpdate(sql);
			if(i>0) System.out.println("삭제 성공");
			else System.out.println("삭제 실패");
		}catch(SQLException se){
			System.out.println("삭제 실패" + se);
		}
	}
	void list() {
		ResultSet rs = null;
		String sql = "select * from "+ tblname;
		
		boolean exist = false;
		
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				exist = true;
				int no = rs.getInt(1);
				String name = rs.getString(2);
				Date rdate = rs.getDate(3);
				
				System.out.println(no + "\t" + name + "\t" + rdate);
			}
			
			if(!exist) System.out.println("데이터 없음");
		}catch(SQLException se) {
			
		}finally {
			try {
				if(rs !=null) rs.close();
			}catch(SQLException se) {}
		}
	}
	void closeAll(){
		try{
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		}catch(SQLException se){}
	}
	
	public static void main(String[] args) {
		JdbcMain2 jm = new JdbcMain2();
		int seq = jm.isTable();
		
		if(seq == YES) {
			jm.droptbl();
		}else if(seq== NO) {
			jm.createtbl();
		}else {
			System.out.println("에러");
		}
		
//		jm.insert(10, "해롱이");
//		jm.insert(20, "패트");
//		jm.insert(30, "매트");
//		jm.insert(40, "에이");
//		jm.insert(50, "비");
//		jm.insert(60, "씨");
//		
//		jm.update(40, "꿀꿀");
//		jm.delete("비");
//		jm.delete(60);
	}

}
