package Day15;

public class Day15_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p.597 
			// �����ٸ� : �ü���� �޸𸮸� ���μ������� �Ҵ��ϴ� ���
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		
		statePrintThread.start();
		
	}

}
