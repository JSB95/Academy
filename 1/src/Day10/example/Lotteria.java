package Day10.example;

import java.io.*;
import java.util.*;

public class Lotteria extends Store{
	
	// field
	private String owner;
	private ArrayList<Product> product_list = new ArrayList<>();
	
	// constructor
	public Lotteria() {
		// TODO Auto-generated constructor stub
	}
	// method
	@Override
	public void product_list() {
		// TODO Auto-generated method stub
		System.out.println("----- 롯데리아 제품 목록 -----");
		int i = 1;
		for (Product temp : product_list) {
			System.out.println(i + ". " + temp.getProduct_name() + "(" + temp.getProduct_price() + ")");
			i++;
		}
		System.out.println();
	}
	
	@Override
	public void product_add() {
		// TODO Auto-generated method stub
		
		// input
		Scanner scanner = new Scanner(System.in);
		System.out.println("----- 롯데리아 상품 추가 -----");
		System.out.print("상품명 : ");		String product_name = scanner.next();
		System.out.print("재고 : ");			int product_stock = scanner.nextInt();
		System.out.print("가격 : ");			int product_price = scanner.nextInt();
		
		// object
		Product product = new Product(product_name, product_stock, product_price);
		
		// add
		product_list.add(product);
		
		// file stream
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:/java/Lotteria_stock.txt");
			String output = product_name + "," + product_stock + "," + product_price;
			fileOutputStream.write(output.getBytes());
		} catch (Exception e) {		// exception
		}
		System.out.println("상품 추가 완료");
		}
		
	}
	

