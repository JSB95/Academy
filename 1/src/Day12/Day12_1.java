package Day12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day12_1 {
	
	public static void main(String[] args) throws IOException {
		// p.496 String class
		
		
		
		// p. 497 ����1
		// 1. ������ ����Ʈ�� ������ �� �ִ� ����Ʈ �迭 ����
		byte[] bytes = { 72, 101, 108, 108 , 111, 32, 74, 97, 118, 97 };
		String str1 = new String (bytes);
		// 3. Ȯ��
		System.out.println("����Ʈ�迭 -> ���ڿ� ��ȯ : " + str1);
		// 4. Ư�� ��ġ���� ��ȯ [new String �迭��, �����ε���, ����)]
		String str2 = new String (bytes, 6, 4);
		// 5. Ȯ��
		System.out.println("����Ʈ �迭 �� 6���ε������� 4�� ��ȯ: " + str2);
		
		// p.498 ����2
			// System.out : �ý��� Ŭ���� �� ��� �ʵ�
			// System.in : �ý��� Ŭ���� �� �Է� �ʵ�
		
		byte[] bytes2 = new byte[100];		// 100���� ����Ʈ�� ������ �� �ִ� �迭
		
		System.out.print("�Է� : ");		// ����ʵ� �� print �޼ҵ� ȣ��
		int readByteNo = System.in.read(bytes2);		// �ܺ� ��� : �ڹ����α׷� �� Ű���� ���� ��Ʈ��ũ �� -> ����� �Ϲݿ��� �߻�
		// Ű���� �Է� ---> ��Ʈ��(��� : ����Ʈ) ---> ��ǻ��
		// a -> 97 // a + enter -> 97, 13[\n], 10[\r : Ŀ���� ������]
		System.out.println("�Է¹��� ����Ʈ : " + Arrays.toString(bytes2));
		String str = new String(bytes2, 0 , readByteNo-2);		// ���� ����Ʈ�� - 2
		System.out.println("�Է¹��� ����Ʈ -> ���ڿ���ȯ : " + str);
		
		// Scanner Ŭ���� [System.in]���� �Է¹���
		Scanner scanner = new Scanner(System.in)
				;
	}

}
