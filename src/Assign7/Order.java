package Assign7;

import java.util.Date;

public class Order {
	private String orederId;
	private String orderDetails;
	private Date orderDate;
	public String getOrederId() {
		return orederId;
	}
	public void setOrederId(String orederId) {
		this.orederId = orederId;
	}
	public String getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Order [orederId=" + orederId + ", orderDetails=" + orderDetails
				+ ", orderDate=" + orderDate + "]";
	}
	public Order(String orderId, String orderDetails, Date orderDate) throws OrderNotValidException {
		if (orderId.length()>3&& orderId.startsWith("O")) {
			
			
		this.orederId = orederId;
		this.orderDetails = orderDetails;
		this.orderDate = orderDate;
	}
		else
			throw new OrderNotValidException();
	}
	public Order() {
	}
	


}
