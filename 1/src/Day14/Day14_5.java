package Day14;

public class Day14_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ex : �������Ҹ�, ����̼Ҹ�, ȣ���̼Ҹ� ���ÿ� 5�� ���
		// 1. Thread Ŭ�����κ��� extends
			// overriding -> ������
		// 2. Runnable �������̽��κ��� implements
			// overriding -> ����
		
		// main�����尡 ���� ������ ������
		
		Dog_Sound dog_Sound = new Dog_Sound();
		dog_Sound.start();

	}

}
