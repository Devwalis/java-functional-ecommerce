package service;

import java.util.ArrayList;
import java.util.List;

import model.Product;

	public class ProductService{
		private static List<Product> product = new ArrayList<>();
	


		public static void createProduct(){
		
		}

		public static void listProducts(){
			if(products.isEmpty()){
			System.out.println("No products found");
				return;	
		}
		for(Product product : products){
			System.out.println(product)	
	}
		}

		public static Product findProductById(Long id){
			return null;
		
		}
		public static void updateProduct(Long id){
		
		}
		
		public static void deleteProduct(Long id){
			
		}
		


			
	}
