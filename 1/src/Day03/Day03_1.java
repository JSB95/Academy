package Day03;

public class Day03_1 { // c s

	@SuppressWarnings("unused")
	public static void main(String[] args) { // m s
		
		
		// 1���� : ���, �Է�
		// 2���� : ����(����), ���(����)
		// ���
			// ��ǻ���� �Ǵܷ� -> ����� ��
			// ����
				// 1. IF (����) ���๮
				// 2. IF (����) ���๮[��];	
				//    ELSE 	   ���๮[����]
				// 3. ���๮�� 2�� �̻�(;�� 2�� �̻��̸�) -> {}
				// 4. ����Ǽ�[����]�� �ټ��� ��
				//	  IF (����1) {���๮ [��1]}
				//    ELSE IF (����2) {���๮ [��2]}
				//    ELSE IF (����3) {���๮ [��3]}
				//    ELSE IF (����4) {���๮ [��4]}
				//    ELSE IF (����5) {���๮ [��5]}
				//    ELSE {���๮ [����]}
		
		// ����1
		if (3>1) System.out.println("��) 3�� 1���� ũ��");
			// ���࿡ 3�� 1���� ũ�� ���, �ƴϸ� ������� �ʴ´�.
		// ����2
		if (3>5) System.out.println("��) 3�� 5���� ũ��");
			// ���࿡ 3�� 5���� ũ�� ���, �ƴϸ� ������� �ʴ´�.
		
		// ����3
		if (3>1) System.out.println("��) 3�� 1���� ũ��");
			// ���࿡ 3�� 1���� ũ�� ���
		else System.out.println("��) 3�� 1���� �۴�");
			// ������ 3�� 1���� ũ�� �ʴٸ� ���
		
		// ���� 4
		if (3>1) { // true ���๮ ����
			System.out.println("true");
			System.out.println("3�� 2���� ũ��");
		} // true ���๮ ��
		else { // false ���๮ ����
			System.out.println("false");
			System.out.println("3�� 2���� �۴�");
		} // false ���๮ ��
		
		// ���� 5
		if (3>5) {
			System.out.println("��) 3�� 5���� ũ��"); // x
		} else if (3>4) {
			System.out.println("��) 3�� 4���� ũ��"); // x
		} else if (3>3) {
			System.out.println("��) 3�� 3���� ũ��"); // x
		} else if (3>2) {
			System.out.println("��) 3�� 2���� ũ��"); // o
		} else {
			System.out.println("false");		  // x
		}
		if(3>5) System.out.println("��) 3�� 5���� ũ��"); 	// x
		if(3>4) System.out.println("��) 3�� 4���� ũ��"); 	// x
		if(3>3) System.out.println("��) 3�� 3���� ũ��"); 	// x
		if(3>2) System.out.println("��) 3�� 2���� ũ��"); 	// o
		if(3<2) System.out.println("false"); 		 	// x
		
		
	}	// m e

} // c e
