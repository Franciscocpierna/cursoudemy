package entities;




public class OrderItem {
	private int Quantity;
	private double price;
	public OrderItem() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderItem(int quantity, double price) {
		Quantity = quantity;
		this.price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void subTotal() {
		
		
	}
}
