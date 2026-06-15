package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import model.Product;

	public class ProductService{

		
		private static List<Product> products = new ArrayList<>();
	


		public static void createProduct(){
			Scanner scanner = new Scanner(System.in);
			

		System.out.println("Enter product name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter product price: ");
		Double price = scanner.nextDouble();
		
		System.out.println("Enter stock quantity: ");
		Integer stock = scanner.nextInt();
		

		Long id = (long) products.size() + 1;

		Product product = new Product(
			id,
			name,
			price,
			stock
		);
	products.add(product);
		
		
		System.out.println("Product crated successufully!");
		System.out.println("ID " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		

		
		}

		public static void listProducts(){
			if(products.isEmpty()){
			System.out.println("No products found");
				return;	
		}
		for(Product product : products){
			System.out.println(product);	
	}
		}

		public static Product findProductById(Long id){

		for(Product product : products){
			if(product.getId().equals(id)){
				return product;
				
			}	
		}
			return null;
		
		}
		public static void updateProduct(){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter product ID: ");
		Long id = scanner.nextLong();
		
		scanner.nextLine();
		
		Product product = findProductById(id);
		
		if(product == null){
			System.out.println("Product not found");
			return;
		}

	System.out.println("\nCurrent Product: ");
	
	System.out.println(product);
	
	System.out.print("\nEnter new product name: ");
	String name = scanner.nextLine();
	
	System.out.println("Enter new product price: ");
	Double price = scanner.nextDouble();
	
	System.out.print("Enter new stock quantity: ");
	Integer stock = scanner.nextInt();

	product.setName(name);
	product.setPrice(price);
	product.setStock(stock);
	
	System.out.println("\nProduct update sucessfully!");

		
		}
		
		public static void deleteProduct(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter product id: ");
		Long id = scanner.nextLong();
		
		Product product = findProductById(id);
	
			
		if(product == null){
			System.out.println("Product not found");
			return;
			}
	System.out.println("\nProduct found: ");
	System.out.println(product);
	
	products.remove(product);
	System.out.println("\nProduct removed sucessfully!");
	
		}
		


			
	}


			
