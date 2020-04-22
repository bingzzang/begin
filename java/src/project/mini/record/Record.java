package project.mini.record;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Vector;

public class Record {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	List<NumberList> list = new Vector<NumberList>();
	
	Record(){
		list.add(new NumberList("홍길동", "010-3232-3232"));
		list.add(new NumberList("한해렁", "010-2414-4243"));
		list.add(new NumberList("김제니", "010-5484-1561"));
		list.add(new NumberList("영심이", "010-4541-3254"));
		list.add(new NumberList("전봉준", "010-1584-8412"));
		list.add(new NumberList("거시기", "010-7054-9842"));
	}
	
	void init() {
		System.out.println("원하는 작업을 선택하세요.");
		System.out.println("---------------------");
		System.out.println("1. 목록보기\n2. 추가\n3. 삭제\n4. 종료");
		System.out.println("---------------------");
		
		try {
			int choice = Integer.parseInt(br.readLine());
			
			if(choice == 1) {
				System.out.println("---------------------");
				show();
			}else if(choice == 2) {
				insert();
			}else if(choice == 3) {
				delete();
			}else if(choice == 4){
				System.exit(0);
			}else {
				System.out.println("다시 입력하세요.");
				init();
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
		
	}
	
	void show() {
//		System.out.println("show()");
		
		for(int i=0; i<list.size();i++) {
			NumberList n = list.get(i);
			System.out.println((i+1)+". "+n.name+"\t"+n.number);
		}
		
		System.out.println("---------------------");
		System.out.println("메뉴로 돌아가시겠습니까?");
		System.out.println("1. 네\n2. 아니요");
		System.out.println("---------------------");
		
		try {
			int choice = Integer.parseInt(br.readLine());
			if (choice ==1) {
				init();
			}else{
				show();
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
		
	}
	
	void insert() {
//		System.out.println("insert()");
		
		try {
			System.out.println("전화번호부 추가(전화번호는 xxx-xxxx-xxxx의 형태로 입력하세요)");
			System.out.println("이름을 입력하세요.");
			String ins1 = br.readLine();
			System.out.println("번호를 입력하세요");
			String ins2 = br.readLine();
			System.out.println("---------------------");
			
			list.add(new NumberList(ins1, ins2));
			
			System.out.println("더 추가하시겠습니까?");
			System.out.println("1. 네\n2. 아니요");
			
			int choice = Integer.parseInt(br.readLine());
			if (choice ==1) {
				insert();
			}else{
				init();
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
		
				
	}
	
	void delete() {
		
		for(int i=0; i<list.size();i++) {
			NumberList n = list.get(i);
			System.out.println((i+1)+". "+n.name+"\t"+n.number);
		}
		
		System.out.println("---------------------");
		System.out.println("삭제하고 싶은 줄의 번호를 입력하세요.");
		
		try {
			int choice = Integer.parseInt(br.readLine());
			
			list.remove(choice-1);
			
			System.out.println("더 삭제하시겠습니까?");
			System.out.println("1. 네\n2. 아니요");
			
			int choice2 = Integer.parseInt(br.readLine());
			if (choice2 ==1) {
				delete();
			}else{
				init();
			}
			
		} catch (IOException e) {
			e.getStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Record rc = new Record();
		rc.init();
	}
}
