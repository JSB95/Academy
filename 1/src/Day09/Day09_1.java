package Day09;

public class Day09_1 {
	
	// p.277 Ȯ�ι���
		
		// 1. 3��
		// 2. 4��
		// 3. 4��
		// 4. 3��
		// 5. 1��	
			// ��ü�� ������X, �ν��Ͻ��� ������O
			// this.�����
			// this.�޼ҵ��
			// this() : �� ������ ȣ��
			// this (data1, data2) : ������
		// 6. void : �޼ҵ尡 ����Ǹ鼭 ��ȯ���� ����. 4 -> override
		// 7. 2��, �޼ҵ� �����ε� -> ����Ÿ���� ���ƾ� �Ѵ�
		// 8. 2�� static : ���� ���
			// ��ü���� Ŭ����Ʋ ���� ���� ���� --> new ��ü�� ����
		// 9. 2�� final : ��� (���� �Ұ�)
		// 10. 4�� (��, ��Ŭ����, ���ڸ����̰��� �����ʹ� �ڵ� ����)
		// 11. 3��
		// 12. field constructor method
		// 13. 
			/*
			 * String name
			 * String id
			 * String pw
			 * int age
			 */
		// 14. 
			/* ������ ����� : Ŭ���� �̸��� �����ϰ�
			 * Member (String name, String id) {
			 * 	this.name = name;
			 * 	this.id = id;
			 * }
			 */
		// 15.
			/*	�Ű����� : �μ�, �޼ҵ� ȣ�� �� �޼ҵ�� ������ ������
			 * [�α��� �޼ҵ�]
			 * boolean login (String id, String password) {
			 * 	if (id.equals("hong") && password.equals("12345") {
			 * 		return true;
			 * 	}
			 * return false;
			 * }
			 * 
			 * [�α׾ƿ� �޼ҵ�] ��ȯŸ�� �޼ҵ��(�μ�1, �μ�2,...)
			 * void logout (String id) {
			 * 	System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			 * }
			 */
		// 16.
			/* ������ �̸����� �޼ҵ带 ���� ���� (��, ���� �ٸ� �μ�[�Ű�����] ���)
			 * void println (int x) {		// �ܺηκ��� int�� ������ �μ��� �޾� ����ϴ� �޼ҵ�
			 *  System.out.println(x);
			 * }
			 * void println (boolean x) {	// �ܺηκ��� boolean�� ������ �μ��� �޾� ����ϴ� �޼ҵ�
			 * 	System.out.println(x);
			 * }
			 * void println (double x) {	// �ܺηκ��� double�� ������ �μ��� �޾� ����ϴ� �޼ҵ�
			 * 	System.out.println(x);
			 * }
			 * void println (String x) {	// �ܺηκ��� String�� ������ �μ��� �޾� ����ϴ� �޼ҵ�
			 * 	System.out.println(x);
			 * }
			 */
		// 17.
			/* ������ �̸����� �޼ҵ带 ���� ���� (��, ���� �ٸ� �μ�[�Ű�����] ���)
			 * static void println (int x) {		// �ܺηκ��� int�� ������ �μ��� �޾� ����ϴ� �޼ҵ�
			 *  System.out.println(x);
			 * }
			 * static void println (boolean x) {	// �ܺηκ��� boolean�� ������ �μ��� �޾� ����ϴ� �޼ҵ�
			 * 	System.out.println(x);
			 * }
			 * static void println (double x) {	// �ܺηκ��� double�� ������ �μ��� �޾� ����ϴ� �޼ҵ�
			 * 	System.out.println(x);
			 * }
			 * static void println (String x) {	// �ܺηκ��� String�� ������ �μ��� �޾� ����ϴ� �޼ҵ�
			 * 	System.out.println(x);
			 * }
			 */
		// 18. x
		// 19. bank_example ��ü

}
