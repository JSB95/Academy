package Day09;

public class Day09_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 상속
			// 부모에게 물려받는 것
			// 현실 : 부모 -> 자식 선택
			// extends : 연장하다 = 상속하다
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		
		System.out.println("채널" + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendvoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동");
		dmbCellPhone.sendvoice("반갑습니다.");
		dmbCellPhone.hangUP();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
