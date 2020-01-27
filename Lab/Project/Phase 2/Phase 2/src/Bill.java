
public class Bill {
	private int quantity;
	private double price;
	private double discount;
	private int accNum;
	public Bill(int quantity, double price, double discount, int accNum) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
		this.accNum = accNum;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	@Override
	public String toString() {
		return "Bill [quantity=" + quantity + ", price=" + price + ", discount=" + discount + ", accNum=" + accNum
				+ "]";
	}
	
	
	
}
