package Day14;

public class Sound extends Thread{
	
	static boolean stop = true;		// 실행 여부 [true : 시작 / false : 중지]
	
	public Sound (boolean stop) {
		this.stop = stop;
		if (this.stop) {
			System.out.println("소리를 켰습니다.");
		} else {
			System.out.println("소리를 껐습니다.");
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (stop) {
			System.out.println("소리 재생중");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
