package Day04;

import java.lang.reflect.Array;
import java.util.*;

public class Day04_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();	
		/*
		 * 1. 사용자에게 6개 수 입력받기 : 1~45사이의 수만 / 아니면 재입력 / 중복이면 재입력 -> 배열로 저장
		 * 2. 추첨번호 : 컴퓨터가 난수 6개 발생 : 1~45 사이 / 중복 X -> 배열로 저장
		 * 3. 사용자 번호와 컴퓨터의 번호와 동일 수의 개수
		 * 
		 */
		int[] user = new int[6];
		int[] com = new int[6];
		
		// 1. 사용자에게 입력받기
		for(int i = 0; i < user.length; i++) {											// i는 1부터 배열의 길이까지 1씩 증가
			System.out.printf("%d번째 번호 입력 : ",i+1);
			int number = scanner.nextInt();
			boolean pass = true;
			
			if (number > 45 || number < 1) {											// 유효성 검사
				System.err.println("1~45사이의 숫자만 입력하세요");
				i--;
				pass = false;
			}																			// 유효성 검사 끝
			
			for (int j = 0; j < 6; j++) {												// 중복검사
				if (number == user[j]) {
					System.err.println("중복된 숫자입니다.");			
					i--;
					pass = false;
				}
			}																			// 중복검사 끝
			if(pass == true) {
				user[i] = number;
			}
			
		}
		Arrays.sort(user);
		System.out.print("당신의 번호는 : ");
		for (int temp : user) {															// 사용자 배열내 모든 인덱스 출력
			System.out.print(temp + " ");
		}
		System.out.println("");
		
		// 2. 난수 생성
		for (int i = 0; i < com.length; i++) {
			int com_number = random.nextInt(44)+1;										// 난수를  int형으로 가져오기 / random.nextInt() : +-20억 사이중 난수 발생 / random.nextInt(수) : 0~수 전까지 사이중 난수 발생 / random.nextInt(수) + 시작번호 : 시작번호 ~ 수 사이중 난수 발생
			boolean pass = true;
			for (int temp : com) {
				if(com_number == temp) {
					i--;
					pass = false;
				}
			}
			if (pass) {
				com[i] = com_number;
			}
		}
		System.out.print("추첨번호 : ");
		Arrays.sort(com);
		for (int temp : com) {
			System.out.print(temp + " ");
		}
		
		// 3. 비교
		int 당첨 = 0;
		for (int i = 0; i <user.length; i++) {
			for (int j = 0; j < com.length; j++) {
				if (user[i] == com[j]) {
					당첨++;
				} 
			}
		}
		System.out.println("");
		System.out.println("당첨수 : " + 당첨);
		
	} // m e
} // c e



