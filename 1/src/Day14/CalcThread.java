package Day14;

public class CalcThread extends Thread{
	
	public CalcThread(String name) {
		// TODO Auto-generated constructor stub
		setName(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 200000000; i++) {
			
		}
		System.out.println("���� ������� ������ �� : " + getName());
	}

}
