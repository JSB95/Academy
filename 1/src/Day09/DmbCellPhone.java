package Day09;

public class DmbCellPhone extends CellPhone{
	// ����Ŭ������ ����Ŭ���� ���� - > extends ����Ŭ����
		// ����Ŭ������ ����Ŭ���� �� ��� ��� ����
	
	// field
	int channel;
	
	// constructor
	public DmbCellPhone (String model, String color, int channel) {
		this.model = model;
		this.color = color;
		// ���� Ŭ������ ���� �ʵ��̹Ƿ� ����Ŭ���� �� ��� ȣ��
		this.channel = channel;
	}
	
	// method
	void turnOnDmb() {
		System.out.println("ä�� : " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}

}
