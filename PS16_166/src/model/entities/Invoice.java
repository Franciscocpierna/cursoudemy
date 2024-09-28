package model.entities;

public class Invoice {
	private Double basicPaymenyt;
	private Double tax;
	
	public Invoice() {
		
	}

	public Invoice(Double basicPaymenyt, Double tax) {
		this.basicPaymenyt = basicPaymenyt;
		this.tax = tax;
	}

	public Double getBasicPaymenyt() {
		return basicPaymenyt;
	}

	public void setBasicPaymenyt(Double basicPaymenyt) {
		this.basicPaymenyt = basicPaymenyt;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
   public Double getTotalPayment() {
	   return getBasicPaymenyt()+getTax();
   }
}
