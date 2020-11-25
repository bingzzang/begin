package book.javajs.chap10;

import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {

	public static void main(String[] args) {
		double[] limits = {60, 70, 80, 90}; 	//낮은값부터
		
		String[] grade = {"D", "C", "B", "A"}; 	//limits랑 grade의 개수와 순서를 맞춰야함
		
		int[] scores = {100, 95, 88, 70, 52, 60, 70};
		
		ChoiceFormat choice = new ChoiceFormat(limits, grade);
		
		for(int i=0; i<scores.length;i++) {
			System.out.println(scores[i]+" : "+choice.format(scores[i]));
		}
		
	}
}
