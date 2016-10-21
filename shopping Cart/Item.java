public class Item {
	private String productName;
	private int quantity;
	private Double unitPrice;

	public Item(String productName, int quantity, Double unitPrice) {
		this.productName = productName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getProductName() {
		return productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setProductName() {
		this.productName = productName;
	}
	public void setQuantity() {
		this.quantity = quantity;
	}
	public void setUnitPrice() {
		this.unitPrice = unitPrice;
	}
	public String tostring() {
		String str = productName + " ";
		str = str + quantity + " ";
		str = str + unitPrice;
		return str; 
	}
}
