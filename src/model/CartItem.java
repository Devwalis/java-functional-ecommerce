package model;

import model.Product;

	public class CartItem{
		
	private Product product;
	private Integer quantity;
			
		
	public CartItem(
		Product product,
		Integer quantity
	){
		this.product = product;
		this.quantity = quantity;
}
		

		public Product getProduct(){
			return product;	
	}
		public void setProduct(Product product){
			this.product = product;
	}

		public Integer getQuantity(){
			return quantity;
			
	}
		public void setQuantity(Integer quantity){
			this.quantity = quantity;
			
	}

		public Double getSubTotal(){
			return product.getPrice() * quantity;
	
	}

}

		
