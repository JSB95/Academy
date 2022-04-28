package Day15;

public class Chatting implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("√§∆√¡ﬂ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
