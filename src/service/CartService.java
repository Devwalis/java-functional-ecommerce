package service;

import model.Cart;
import model.Product;
import java.util.Scanner;

public class  CartService{
	

	public static Cart cart = new Cart();
		
	

	public static void  addProductCart(){
			
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Product ID: ");
		Long id = scanner.nextLong();

		Product product = ProductService.findProductById(id);
		
	if(product == null){
	System.out.println("Product not found");
	return;
	
	
	}
	cart.getProduct().add(product);
	
	System.out.println("\nProduct added to cart successfully!");

	System.out.println(product);

	



	}		
		
	
	public static void listCart(){

	
	}

	public static void  removeProductFromCart(){
	
	}
	
	}
