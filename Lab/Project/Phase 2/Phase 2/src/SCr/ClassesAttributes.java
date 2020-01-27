
public class ClassesAttributes {
	
	private double price;
	private String type;
	public ClassesAttributes(double price, String type) {
		super();
		this.price = price;
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ClassesAttributes [price=" + price + ", type=" + type + "]";
	}
	
	

}
