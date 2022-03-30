package project_끝말잇기;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class TimerTest extends JFrame{
	
	private JPanel panel;
	private Timerbar timerbar;
	private Thread threadBar;
	private TimerNum timerNum;
	private Thread threadNum;
	
	public TimerTest() {
		int second = 60;
		
		panel = new JPanel();
		panel.setLayout(null);
		timerbar = new Timerbar(second);
		threadBar = new Thread(timerbar);
		threadBar.start();
		//panel.add(timerbar);
		
		timerNum = new TimerNum(second);
		threadNum = new Thread(timerNum);
		threadNum.start();
		panel.add(timerNum);
		
		add(panel);
		setTitle("타이머");
		setSize(270,130);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TimerTest();
	}
	
}