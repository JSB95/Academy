package Day15;

public class SumThread extends Thread{
	
	private long sum;
	
	public long getsum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	// parallel
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
	}

}
