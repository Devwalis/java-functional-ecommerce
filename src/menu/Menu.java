package menu;

import service.ProductService;
import java.util.Scanner;
	
public class Menu{
	public static void show(){
	Scanner scanner = new Scanner(System.in);
	
	
	int option;
		
	do {
		displayMenu();
		
	
		option = scanner.nextInt();
		
		processOption(option);
		
	
	} while (option != 0);

	}

		private static void displayMenu(){
		
		System.out.println();
        System.out.println("=================================");
        System.out.println("     JAVA FUNCTIONAL ECOMMERCE");
        System.out.println("=================================");
        System.out.println("1 - Create Product");
        System.out.println("2 - List Product");
        System.out.println("3 - Update Product");
        System.out.println("4 - Delete Product");
        System.out.println("0 - Exit");
        System.out.print("Choose an option: ");
	
	}

	private static void processOption(int option){
		
		switch (option) {

			case 1:
				System.out.println("Product management selected");
				ProductService.createProduct();
				break;
			case 2:
				System.out.println("List Product");
				ProductService.listProducts();
				break;
			case 3: 	
				System.out.println("Update Product");
				ProductService.findProductById(1L);
				
				break;
			case 4: 
				System.out.println("Delete Product");
				break;
			case 0: 
				System.out.println("Application Finished");
				break;
		
		 	
	}
		
	}
	}
