package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class JdbcMain {

	JdbcMain(){
		String url = "jdbc:oracle:thin:@localhost:1521:java";
		String sql = "select * from EMP order by EMPNO"; //sql문
		
		Connection con = null;	//db와 연결성을 갖는 인터페이스
		Statement stmt = null;	//sql문을 실행하는 인터페이스
		ResultSet rs = null;	//조회된 결과 데이터를 갖는 인터페이스		
		
		try {
			// classNotFoundException 오류 발생 -> try-catch
			Class.forName("oracle.jdbc.driver.OracleDriver"); 	//패키지명.드라이버클래스명
			System.out.println("(1) 드라이버 로딩 성공");
			
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("(2) Oracle 연결 성공");
			
			stmt = con.createStatement();
			System.out.println("(3) Statement 생성 성공");
			
			rs = stmt.executeQuery(sql);
			System.out.println("(4) Statement 실행 성공");
			System.out.println("번호\t이름\t직업\t매니저\t입사일\t급여\t커미션\t부서번호");
			System.out.println("-----------------------------------------------------");
			
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				Date hiredate = rs.getDate(5);
				float sal = rs.getFloat(6);
				float comm = rs.getFloat(7);
				int deptno = rs.getInt(8);
				
				System.out.println(empno + "\t" + ename + "\t" + job + "\t" + mgr + "\t" 
						+ hiredate + "\t" + sal + "\t" + comm + "\t" + deptno);
			}
			System.out.println("(5) 데이터 추출 성공");
			
			rs.close();
			stmt.close();
			con.close();
			System.out.println("(6) 연결 객체 닫기 성공");
			
		}catch(ClassNotFoundException cnfe) {
			System.out.println("드라이버 로딩 실패");
		}catch(SQLException se) {
			System.out.println("오라클 연결 실패");
		}
	}
	
	public static void main(String[] args) {
		new JdbcMain();
	}
}
