package project_끝말잇기;

import java.awt.Color;
import javax.swing.JLabel;


class Timerbar extends JLabel implements Runnable{
	
	int width = 225, height = 25;
	int x = 10, y = 10;
	Color color = new Color(0, 0, 0);
	
	int second;
	
	public Timerbar(int second) {
		setBackground(color);
		setOpaque(true);
		setBounds(x, y, width, height);
		this.second = second;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Thread.sleep(1000 / (width / second));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if (getWidth() > 0) {
				width -= 1;
				//System.out.println(width);
				setBounds(x, y, width, height);
			} else {
				//System.out.println("종료");
				break;
			}
		}
	}

}