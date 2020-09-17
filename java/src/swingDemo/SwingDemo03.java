package swingDemo;

import javax.swing.*;

public class SwingDemo03 extends JFrame{	
	//inheriting jframe

	JFrame f;

	public SwingDemo03() {
		
		JButton b = new JButton("click"); 	//creating instance of JButton
		b.setBounds(130, 100, 100, 40);
		
		add(b);	//adding button in JFrame
		
		setSize(400, 500); 	//width height
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingDemo03();
	}
	
	
}
