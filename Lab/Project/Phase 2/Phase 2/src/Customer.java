
public class Customer {

		private int BankNO;
		private String Bname;
		private int custID ;
		private int orderNO;
		public Customer(int BankNO, String Bname, int custID, int orderNO) {
			this.BankNO = BankNO;
			this.Bname = Bname;
			this.custID = custID;
			this.orderNO = orderNO;
		}
		public int getBankNo() {
			return BankNO;
		}
		public void setBankNo(int BankNO) {
			this.BankNO = BankNO;
		}
		public String getBname() {
			return Bname;
		}
		public void setBname(String Bname) {
			this.Bname = Bname;
		}
		public int getcustID() {
			return custID;
		}
		public void setcustID(int custID) {
			this.custID = custID;
		}
		
		
		public int getOrderNO() {
			return orderNO;
		}
		public void setOrderNO(int orderNO) {
			this.orderNO = orderNO;
		}
		@Override
		public String toString() {
			return "Cust [BAccNo=" + BankNO + ", Bname=" + Bname + ",custID =" + custID
					+ ", orderNO ="+orderNO+ "]";
		}
}

