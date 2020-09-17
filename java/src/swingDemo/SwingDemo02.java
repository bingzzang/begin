package swingDemo;

import javax.swing.*;

public class SwingDemo02 {	
	//using constructor

	JFrame f;

	public SwingDemo02() {
		f = new JFrame(); 	//creating instance of JFrame
		
		JButton b = new JButton("click"); 	//creating instance of JButton
		b.setBounds(130, 100, 100, 40);
		
		f.add(b);	//adding button in JFrame
		
		f.setSize(400, 500); 	//width height
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingDemo02();
	}
	
	
}
