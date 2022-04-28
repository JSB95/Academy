package Day14;

public class Cat_Sound extends Thread {
	
	@Override
	public void run() {
		for( int i = 0 ; i<5;i++) {
			System.out.println("¾ß¿Ë"+i);
			try { Thread.sleep(500); }
			catch( Exception e ) {}
		}
		
	}

}
