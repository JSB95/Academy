package Day09;

public class Day09_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���
			// �θ𿡰� �����޴� ��
			// ���� : �θ� -> �ڽ� ����
			// extends : �����ϴ� = ����ϴ�
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		
		System.out.println("ä��" + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendvoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿");
		dmbCellPhone.sendvoice("�ݰ����ϴ�.");
		dmbCellPhone.hangUP();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
