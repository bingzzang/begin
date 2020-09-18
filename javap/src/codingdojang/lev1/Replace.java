package codingdojang.lev1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Replace {
	
	public static void main(String[] args) throws Exception {

		String test= "ban			ana";
		String res = test.replaceAll("\t", "    ");
		System.out.println(test);
		System.out.println(res);
		
		File file = new File("resources/fruit.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		List<String> lines = new ArrayList<String>();
		
		while((line = br.readLine())!= null) {
			line.replaceAll("\t", "    ");
			lines.add(line);
			System.out.println(line);
			System.out.println(lines.get(0));
		}
//		
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("resources/fruit.txt"));
//		
//		for(int i=0; i<lines.size();i++) {
//			bw.write(lines.get(i));
//			bw.newLine();
//		}
//		br.close();
//		bw.flush();
//		bw.close();
//		
	}
}
