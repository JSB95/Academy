package Day11;

public class Day11_1 {
	
	// p. 386 Ȯ�� ����
		// 1. 3�� �������̽��� ��� : ��� �ʵ�, �߻�޼ҵ�, ����Ʈ�޼ҵ�, �����޼ҵ�
		// 2. 4�� �������̽� ���� = ���� ��ü
			// ���� ��ü = Ŭ������ implements�� ��ü
	
		// 3.
	
	private static void printSound (Soundable soundable) {
//  ���������� ����    ��ȯ Ÿ�� �޼ҵ��  (�μ� - ����, �迭, ��ü, �������̽�)
		System.out.println(soundable.sound());
	}
	
	public static void dbwork (DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		printSound(new Cat()); 	// ���� ��ü
		printSound(new Dog());
		Soundable soundable = new Cat();
		Soundable[] soundables = new Cat[100];
		
		// 4. 
		dbwork(new OracleDAO());
		dbwork(new MySQLDAO());
		
		// 5. �͸�ü [�������̽��� ���� ����]
			// ������ü : �������̽��� ��ü�� = new Ŭ������();
			// �͸�ü : �������̽��� ��ü�� = new �������̽� ( {����} )
		Action action = new Action() {
			
			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("���縦 �մϴ�.");
			}
		}; // ���� ��
		
		action.work();
	}

}
