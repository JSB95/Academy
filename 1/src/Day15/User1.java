package Day15;

public class User1 extends Thread {
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("user1");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		calculator.setMemory(100);
	}

}
