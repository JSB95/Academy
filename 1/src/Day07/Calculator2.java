package Day07;

public class Calculator2 {
	
	// field
	
	// constructor
	
	// method execute / average / plus / print
	
	void execute() { // factor X return X
		double result = avg(7, 10);
		println("실행결과 : " + result);
		
	}
	
	double avg(int x, int y) { // factor O return O
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	int plus(int x, int y) { // factor O return O
		int result = x + y;
		return result;
	}
	
	void println(String message) { // factor O return X
		System.out.println(message);
	}
	

}
