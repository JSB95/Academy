package Day14;

import java.awt.Toolkit;

public class BeepThread extends Thread {
						// 상속 thread [멀티스레드 클래스]
	// run 메소드 오버라이딩
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
