package Day09;

public class KumhoTire extends Tire{
	
	// field
	// constructor
	public KumhoTire (String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// method
	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
		accumulatedRaotation++;
		if (accumulatedRaotation < maxRotation) {
			System.out.println(location + "��ȣŸ�̾� ����" + (maxRotation-accumulatedRaotation));
			return true;
		} else {
			System.out.println("*** " + location + " ��ȣŸ�̾� ��ũ ***");
			return false;
		}
	}

}
