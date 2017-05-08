package Assign7;

public class Customer {
	private int custNo;
	private String custName;
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + "]";
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Customer(int custNo, String custName) {
		super();
		this.custNo = custNo;
		this.custName = custName;
	}
	public Customer() {
		super();
	}
	


}
