package new_expt;

public class Product implements Comparable<Product>{
	
	 private int prodId;
     private String prodName;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Product(int prodId, String prodName) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + "]";
	}
	@Override
	public int compareTo(Product o) {
		if(prodId==o.prodId)
			return 1;
		if(prodId>o.prodId)
			return 0;
		else
		return -1;
	}
     



}
