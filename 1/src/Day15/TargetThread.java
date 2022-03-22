package Day15;

public class TargetThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (long i = 0; i < 100000000; i++) {
			
		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (long i = 0; i < 1000000000; i++) {
			
		}
	}

}
