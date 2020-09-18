package codingdojang.lev1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find2 {

    String data = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
    String[] names = data.split(",");

    // 1. 김씨와 이씨는 각각 몇 명인가요?
    void find() {

	   int countLee = 0;
	   int countKim = 0;
	
	   for (String name : names) {
	       if (name.startsWith("이")) {
	    	   countLee++;
	       } else if (name.startsWith("김")) {
	    	   countKim++;
	       }
	   }
	
	   System.out.println("김씨 : " + countKim);
	   System.out.println("이씨 : " + countLee);
    }

    // "이재영"이란 이름이 몇 번 반복되는가?
    void fineLee() {
	   int count = 0;
	
	   for (String name : names) {
	       if (name.equals("이재영"))
	      count++;
	
	   }
	
	   System.out.println("'이재영'이란 이름이 반복 되는 횟수 : " + count);
    }

    // 중복을 제거한 이름을 출력
    void removeDup() {
	   // set이용
	   Set<String> nameset = new HashSet<>(Arrays.asList(names));
	   System.out.println(String.join(",", nameset));

    }

    // 중복을 제거한 이름을 오름차순으로 정렬하여 출력
    void removeDup2() {
    	Set<String> nameset = new HashSet<>(Arrays.asList(names));
	    List<String> list = new ArrayList<>(nameset);
	    Collections.sort(list);
	    System.out.println(String.join(",", list));
    }

    // 중복을 제거한 이름을 내림차순 정렬하여 출력
    void removeDup3() {
	   Set<String> nameset = new HashSet<>(Arrays.asList(names));
	   List<String> list = new ArrayList<>(nameset);
	   Collections.sort(list, Comparator.reverseOrder());
	   System.out.println(String.join(",", list));
    }

    public static void main(String[] args) {

	   Find2 f = new Find2();
	   f.find();
	   f.fineLee();
	   f.removeDup();
	   f.removeDup2();
	   f.removeDup3();
    }
}