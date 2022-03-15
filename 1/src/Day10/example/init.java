package Day10.example;

import java.util.*;

public class init {
	// »ó¼Ó : store
	// class : Lotteria, Burgerking
	// interface : kiosk
	// file : product list
	
	public static void main(String[] args) {
		Kiosk lotteria = new Lotteria(); 
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			lotteria.product_list();
			int ch = scanner.nextInt();
			if (ch == -1) {
				lotteria.product_add();
			}
			
		}
	}

}
