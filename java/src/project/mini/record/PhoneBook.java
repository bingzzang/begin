package project.mini.record;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class PhoneBook {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	Connection con;
	PreparedStatement psmt;
	ResultSet rs;
	
	int seq;
	String name;
	String phone;
	Date wdate;
	
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	PhoneBook(){
		String id = "bing";
		String pwd = "bing";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 성공");
			System.out.println("-----------------------");
		}catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		}catch(SQLException se) {
			System.out.println(se);
		}
		
	}
	
	void init() {
		System.out.println("아래 중 하나 고르세요");
		System.out.println("1. 조회\t2. 추가\t3. 수정\t4. 삭제\t5. 종료");
		try {
			int no = Integer.parseInt(br.readLine());
			
			switch(no) {
			case 1:
				select();
				break;
			case 2:
				insert();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				allClose();
				System.exit(0);
				break;
			default:
				init();
			}
		} catch (IOException e) {
			System.out.println("init 오류 : "+e);
		}
		
	}
	void select() {
		try {
			String sql = "select * from phonebook";
			psmt = con.prepareStatement(sql);
			try {
				rs = psmt.executeQuery();
				try {
					System.out.println("no\t이름\t번호\t날짜");
					System.out.println("--------------------");
					
					while(rs.next()) {
						seq = rs.getInt(1);
						name = rs.getString(2);
						phone = rs.getString(3);
						wdate = rs.getDate(4);
						
						System.out.println(seq+"\t"+name+"\t"+phone+"\t"+wdate);
					}
					System.out.println("--------------");
					System.out.println("1. 메뉴\t2. 종료");
					int no = Integer.parseInt(br.readLine());
					if(no ==1) {
						init();
					}else{
						rs.close();
						allClose();
						System.exit(0);
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
	
	void insert() {
		String sql = "insert into phonebook values(phonebook_seq.nextval, ?, ?, sysdate)";
		
		try {
			System.out.println("이름 입력");
			System.out.print("> ");
			name = br.readLine();
			
			System.out.println("번호 입력(xxx-xxxx-xxxx)");
			System.out.print("> ");
			phone = br.readLine();
			
			psmt = con.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, phone);
			
			psmt.executeUpdate();
			System.out.println("추가 성공");
			System.out.println("--------------");
			System.out.println("1. 메뉴\t2. 종료");
			int no = Integer.parseInt(br.readLine());
			if(no ==1) {
				init();
			}else{
				allClose();
				System.exit(0);
			}
		}catch(IOException ie) {
			System.out.println("입력 에러 :" +ie);
		}catch(Exception e) {
			System.out.println("insert error : "+e);
		}
	}
	
	void update() {
//		select();
		System.out.println("--------------------");
		String sql = null;
		System.out.println("수정하고 싶은 사람 번호");
		System.out.print(">");
		try {
			seq = Integer.parseInt(br.readLine());
			System.out.println("바꾸고 싶은 것");
			System.out.println("A. 이름\tB.번호");
			System.out.print(">");
			
			String choice = br.readLine();
			if(choice.equalsIgnoreCase("A")) {
				System.out.println("바꿀 이름");
				System.out.print(">");
				
				sql = "update phonebook set name = ?, wdate =sysdate where seq=?";
				try {
					psmt = con.prepareStatement(sql);
					psmt.setString(1, name);
					psmt.setInt(2, seq);
					psmt.executeUpdate();
					System.out.println("수정성공");
					System.out.println("--------------");
					System.out.println("1. 메뉴\t2. 종료");
					int no = Integer.parseInt(br.readLine());
					if(no ==1) {
						init();
					}else{
						allClose();
						System.exit(0);
					}
				}catch(Exception e) {
					System.out.println("이름 수정 오류 : "+e);
				}
			}else if(choice.equalsIgnoreCase("B")) {
				System.out.println("바꿀 이름");
				System.out.print(">");
				
				sql = "update phonebook set phone = ?, wdate =sysdate where seq=?";
				try {
					psmt = con.prepareStatement(sql);
					psmt.setString(1, phone);
					psmt.setInt(2, seq);
					psmt.executeUpdate();
					System.out.println("수정성공");
					System.out.println("--------------");
					System.out.println("1. 메뉴\t2. 종료");
					int no = Integer.parseInt(br.readLine());
					if(no ==1) {
						init();
					}else{
						allClose();
						System.exit(0);
					}
				}catch(Exception e) {
					System.out.println("번호 수정 오류 : "+e);
				}
			}else {
				System.out.println("다시 입력");
				update();
			}
		}catch(IOException ie) {
			System.out.println("수정 입력 오류");
		}
		
	}
	
	void delete() {
//		select();
		System.out.println("-----------------------");
		System.out.println("삭제하고 싶은 사람 번호");
		System.out.print(">");
		try {
			seq = Integer.parseInt(br.readLine());
			String sql = "delete from phonebook where seq=?";
			try {
				psmt = con.prepareStatement(sql);
				psmt.setInt(1, seq);
				psmt.executeUpdate();
				System.out.println("삭제 성공");
				System.out.println("--------------");
				System.out.println("1. 메뉴\t2. 종료");
				int no = Integer.parseInt(br.readLine());
				if(no ==1) {
					init();
				}else{
					allClose();
					System.exit(0);
				}
			}catch(Exception e) {
				System.out.println("삭제 오류 :" +e);
			}
		}catch(IOException ie) {
			System.out.println("삭제입력오류 : "+ ie);
		}
	}
	
	void allClose() {
		try{
			if(psmt != null) psmt.close();
			if(con != null) con.close();
		}catch(SQLException se){}
	}
	
	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.init();

	}

}
