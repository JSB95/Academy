package Day09;

public class Tire {
	
	// field
	
	public int maxRotation;				// �ִ� ȸ����(ȸ�� ���ɼ�)
	public int accumulatedRaotation;	// ���� ȸ����
	public String location;				// Ÿ�̾� ��ġ
	
	// constructor
	public Tire (String loaction, int maxRotation) { // Ÿ�̾� ��ġ, �ִ� ȸ����
		this.location = loaction;
		this.maxRotation = maxRotation;
	}
	
	// method
	public boolean roll() {		// Ÿ�̾� ȸ�� ����
		accumulatedRaotation++;	// ����ȸ����(Ÿ�̾�ȸ��) 1����
		if (accumulatedRaotation < maxRotation) {	// ����ȸ������ �ִ� ȸ�������� ������ (������)
			System.out.println(location + "Tire ���� : " + (maxRotation-accumulatedRaotation) + "ȸ");
			return true;
		} else { // �ƴϸ� (������ ������)
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false;
		}
	}

}
