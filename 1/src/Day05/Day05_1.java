package Day05;

public class Day05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� : �ϳ��� ������ ����
		// �迭 : ������ �ڷ��� �����͸� Ư������[�ε���]���� ����
		
		// 1���� �迭 : ����
			// ���� : �ڷ���[] �迭�� = new �ڷ���[����];
			// int[] arr = new int[3]; -> int int int
			// * int�� ���� 3���� ������ �� �ִ� �迭
		// 2���� �迭 : ���α��� ���α���
			// ���� : �ڷ���[][] �迭�� = new �ڷ���[����=��][����=��];
			// int[][] arr2 = new int[4][3];
			// int int int
			// int int int
			// int int int
			// int int int
			// * int�� ���� 12���� ������ �� �ִ� �迭
		// 3���� �迭 : ���α��� ���α��� ���̱���
			// ���� : �ڷ���[][][] �迭�� = new �ڷ���[����][����][����];
		
		// ������ �迭 -> ���� ������ ���� (DB)
		
		// ����1)
		int[] array = new int[3];									// int : 4byte * 3 = 12byte array
		array[0] = 80;												// 0�� �ε����� 80 ������ ����
		array[1] = 90;
		array[2] = 100;
		
		int[][] array2 = new int[2][3];								// [����=��][����=��] 4byte * 2 * 3 = 24byte
		array2[0][0] = 80;	array2[0][1] = 90;	array2[0][2] = 100;
		array2[1][0] = 40;	array2[1][1] = 50;	array2[1][2] = 60;
		System.out.println("1���� �迭 : " + array);					// �ε��� ���� �迭�� ȣ�� ��
		System.out.println("2���� �迭 : " + array2);					// [�޸�]�ּҰ� ���
		
		System.out.println("1���� �迭 ���� : " + array.length);		// �迭�� ����
		System.out.println("2���� �迭 �� ���� : " + array2.length);	// 2���� �迭�� �� ����
		System.out.println("2���� �迭 �� ���� : " + array2[0].length); // 2���� �迭�� �� ����
		
		// ����2) �ݺ����� �̿��� 0~49���� ù��° �࿡ ���� / 50~99���� �ι�° �࿡ ����
		int[][] array3 = new int[2][50];							// int : 4byte * 2 * 50 => 400byte
		for (int i = 0; i<100; i++) {
			
			if (i <50) {											// ù��° �࿡ �� �ֱ�
				array3[0][i] = i;									// [0] : ù��° �� ��ȣ [i] : i��° �� ��ȣ
			} else { 												// �ι�° �࿡ �� �ֱ�		
				array3[1][i-50] = i;								// [1] : �ι�° �� ��ȣ [i] : i��° �� ��ȣ
			}
			
		}
		
		for (int i = 0; i<100; i++) {								// ��� �ݺ���
			if ( i < 50) {
				System.out.printf("%d ",array3[0][i]);				// %d : ���� %����d : ���ڸ�ŭ ĭ ����(��, �����Ͱ� ������ ����) %f : �Ǽ� %.2f : �Ҽ��� �ڸ��� 
			} else  {
				System.out.printf("%d ",array3[1][i-50]);
			} 
			if (i == 49) {
				System.out.println("");
			}
		}

	} // main end

} // class end
