package Day09;

public class HankookTire extends Tire{
	
	// field
	// constructor
	public HankookTire (String location, int maxRoatation) {
		super(location, maxRoatation);
		// super (factor1, factor2) ����Ŭ���� �� [�μ� 2��] ������ ȣ��
	}
	
	// method
	@Override 	// ����Ŭ���� �� �޼ҵ带 ������ (����)
	public boolean roll() {
		// TODO Auto-generated method stub
		accumulatedRaotation++;
		if (accumulatedRaotation < maxRotation) {
			System.out.println(location + "�ѱ�Ÿ�̾� ����" + (maxRotation-accumulatedRaotation));
			return true;
		} else {
			System.out.println("*** " + location + " �ѱ�Ÿ�̾� ��ũ ***");
			return false;
		}
	}
	
	

}
