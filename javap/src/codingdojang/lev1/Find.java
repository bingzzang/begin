package codingdojang.lev1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Find {
	
	String data = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
	String[] names = data.split(",");
	
	//1. 김씨와 이씨는 각각 몇 명인가요?
	void find() {
		
		int countLee=0;
		int countKim=0;
		
		for(int i=0;i<names.length;i++) {
			String lastName = names[i].substring(0,1); // names[i].startWith("이") or names[i].startWith("김")
			
			if("이".equals(lastName)) countLee++;
			if("김".equals(lastName)) countKim++;
		}
		System.out.print("김씨 : "+countKim);
		System.out.println(", 이씨 : "+countLee);
	}
	
	//"이재영"이란 이름이 몇 번 반복되는가?
	void fineLee() {
		int count = 0;
		
		for(int i=0;i<names.length;i++) {
			if("이재영".equals(names[i])) count++;
		}
		
		System.out.println("'이재영'이란 이름이 반복 되는 횟수 : "+count);
	}
	
	//중복을 제거한 이름을 출력
	void removeDup() {
		//set이용
		/*
		Set<String> nameset = new HashSet<String>();
		for(int i=0; i<names.length;i++) {
			nameset.add(names[i]);
		}
		
		Iterator<String> it = nameset.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());
			if(it.hasNext()==true) {
				System.out.print(", ");
			}
		}*/
		
		//list이용
		List<String> namelist = new ArrayList<String>();
		
		for(String n : names) {
			if(!namelist.contains(n)) namelist.add(n);
		}
		
		for(int i=0; i<namelist.size();i++) {
			System.out.print(namelist.get(i));
			if(i != namelist.size()-1) System.out.print(", ");
		}
		System.out.println();
	}
	
	//중복을 제거한 이름을 오름차순으로 정렬하여 출력
	void removeDup2() {
		List<String> namelist = new ArrayList<String>();
		Arrays.sort(names);
		
		for(String n : names) {
			if(!namelist.contains(n)) namelist.add(n);
		}
		
	
		for(int i=0; i<namelist.size();i++) {
			System.out.print(namelist.get(i));
			if(i != namelist.size()-1) System.out.print(", ");
		}
	}
	public static void main(String[] args) {
		
		Find f = new Find();
		f.find();
		f.fineLee();
		f.removeDup();
		f.removeDup2();
	}
}
