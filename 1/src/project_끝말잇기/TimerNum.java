package project_³¡¸»ÀÕ±â;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

class TimerNum extends JLabel implements Runnable{
	int width = 75, height = 75;
	int x = 90, y = 20;
	
	int second;
	
	public TimerNum(int second) {
		setOpaque(true);
		setBounds(x, y, width, height);
		setForeground(Color.black);
		setText(second + "");
		setFont(new Font("¸¼Àº°íµñ", Font.PLAIN, 25));
		setHorizontalAlignment(JLabel.CENTER);
		this.second = second;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (second > 0) {
				second -= 1;
				setText(second + "");
			} else {
				//System.out.println("Á¾·á");
				break;
			}
		}
	}
}
	
