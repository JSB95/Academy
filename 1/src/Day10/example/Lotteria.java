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
		System.out.println("----- �Ե����� ��ǰ ��� -----");
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
		System.out.println("----- �Ե����� ��ǰ �߰� -----");
		System.out.print("��ǰ�� : ");		String product_name = scanner.next();
		System.out.print("��� : ");			int product_stock = scanner.nextInt();
		System.out.print("���� : ");			int product_price = scanner.nextInt();
		
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
		System.out.println("��ǰ �߰� �Ϸ�");
		}
		
	}
	

