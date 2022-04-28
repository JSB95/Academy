package Day15;

public class Calculator {
	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// method
		// ������1�� 100�� �ְ� ������2�� 50�ְ� ������ => �����߻�
		// synchronized : ����ȭ
			// ������ 1��100 �ְ� (������ 2 �����) 100 ���
				// ������2�� ������ 1�� �޼ҵ� ���ᰡ �ɶ����� ���
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// memory ���
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
