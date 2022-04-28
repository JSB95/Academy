package Day01;

import java.util.*;

public class Day01_5 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 : ");
		String ID = scanner.next();
		System.out.println("비밀번호 : ");
		String PW = scanner.next();
		System.out.println("성명 : ");
		String NAME = scanner.next();
		System.out.println("이메일 : ");
		String EMAIL = scanner.next();
		
		System.out.println(">>>>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 >>>>>>>>>");
		System.out.println("아이디\t비밀번호\t성명\t이메일");
		System.out.printf("%s\t%s\t%s\t%s",ID,PW,NAME,EMAIL);
		
	}

}
