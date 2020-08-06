package app.game;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BattleUI {

	JFrame frame = new JFrame("Jframe");
	JButton button = new JButton("Jbutton");
	
	public void createFrame() {
		
		//프레임에 컴포넌트 추가
		frame.add(button);
		
		frame.setSize(600, 500);
		
		frame.setVisible(true);
		
		//swing에만 있는 x버튼 클릭시 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		BattleUI ui = new BattleUI();
		ui.createFrame();
	}
}
