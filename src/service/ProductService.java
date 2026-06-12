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
			return null;
		
		}
		public static void updateProduct(Long id){
		
		}
		
		public static void deleteProduct(Long id){
			Product product = findProductById(id);
			
		if(product == null){
			System.out.println("Product not found");
			return;
			}
	products.remove(product);
	System.out.println("Product removed successfully. ");	
		}
		


			
	}


				
