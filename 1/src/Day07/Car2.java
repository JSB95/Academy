package Day07;

public class Car2 {
	
	// field
	int speed;
	
	// constructor
	
	// method
	int getSpeed() {	// factor X retrun O
		return speed;
	}
	
	void keyTurnOn() {	// factor X return X
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for (int i = 10; i <= 50; i+=10) {
			speed = i;
			System.out.println("달립니다. (시속 : " + speed + "km/h)");
		}
	}

}
