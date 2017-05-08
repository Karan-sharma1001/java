
public class Account implements AccountInter {
	private int accNo;
	private String name;
	private double accBal;


	@Override
	public void create(int accNo, String name, double accBal) {
		// TODO Auto-generated method stub
		 this.accNo=accNo;
		 this.name=name;
		 this.accBal=accBal;

	}

	@Override
	public double delete(int accNo) {
		System.out.println("Account with account no "+accNo+" is deleted, having balance "+accBal+ " name is "+name);
		return 0;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	@Override
	public void print(int accNo) {
		// TODO Auto-generated method stub
System.out.println("Account details are "+this.name+"  "+this.accBal+" of account no "+accNo );
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accBal="
				+ accBal + "]";
	}

}
