package day1_1;

public class customer {
	private String custId;
	private String custName;
	private int custMobile;
	private static int count;
	
	static
	{
		System.out.println("In static block");
		count=10;
	}
	
	public customer(String custId, String custName, int custMobile) 
	{
		super();
		System.out.println("In Parameter constructor");
		this.custId = custId;
		this.custName = custName;
		this.custMobile = custMobile;
		count++;
	}
	public customer() {
	System.out.println("In default constructor");
	count++;
	}
	// non static mehods can use static
	public void showInfo(){
		System.out.println(this.custId);
		System.out.println(this.custMobile);
		System.out.println(this.custName);
		System.out.println("count is "+count);
	}
	//static methods cant use non static values
	//static method is called using class name
	public static void  showCount() {
		
		System.out.println("count is "+count);
	}
	}
	
	
	
	

