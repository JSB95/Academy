package Day14;

import java.util.Scanner;

public class Day14_6_player {
	
	// ���� [1. ������� 2. �������]
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		// �Է°�ü
		
		boolean soundsw = true;
		boolean moviesw = true;
	
		
		while (true) {
			System.out.println("1. �Ҹ���� 2. �������");
			System.out.print("���� > "); int ch = scanner.nextInt();
			
			if (ch == 1) {
				if (Sound.stop) { 			// �Ҹ� ���
					Sound sound = new Sound(true);
					sound.start();
					Sound.stop = false;	// �Ҹ� ����
				}
			} else if (ch == 2) {
				
				Movie movie = new Movie();
				if(moviesw) {
					movie.Moviestop(true);
					movie.start();
					moviesw = false;
				}
				
			}
		}
	}

}
