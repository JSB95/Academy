package Day14;

import java.util.Scanner;

public class Day14_6_player {
	
	// 예제 [1. 음악재생 2. 영상재생]
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		// 입력객체
		
		boolean soundsw = true;
		boolean moviesw = true;
	
		
		while (true) {
			System.out.println("1. 소리재생 2. 영상재생");
			System.out.print("선택 > "); int ch = scanner.nextInt();
			
			if (ch == 1) {
				if (Sound.stop) { 			// 소리 재생
					Sound sound = new Sound(true);
					sound.start();
					Sound.stop = false;	// 소리 종료
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
