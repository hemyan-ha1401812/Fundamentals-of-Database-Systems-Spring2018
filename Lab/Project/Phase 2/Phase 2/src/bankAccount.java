
public class bankAccount {
	private String bName;
	private double amount;
	private int accNum;
	
	
	
	
	public bankAccount(String bName, double amount, int accNum) {
		super();
		this.bName = bName;
		this.amount = amount;
		this.accNum = accNum;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	@Override
	public String toString() {
		return "bankAccount [bName=" + bName + ", amount=" + amount + ", accNum=" + accNum + "]";
	}

	











}
