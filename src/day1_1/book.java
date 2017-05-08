package day1_1;

public class book {
	private int bookNo;
	private String title;
	private String author;
	private float price;
	private static  int bookCount;
	
	
	static {
		bookCount=3;
	}

	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void showBook() {
		System.out.println("Book no : "+bookNo+"\nTitle is "+title+"\nAuthor is "+author+"\nPrice is "+price);
	}
	public book(int bN,String t,String a,int p){
		if (p > 0 && p < 5000 && a.length( )>= 4 )
		{	
		this.bookNo=bN;
		this.title=t;
		this.author=a;
		this.price=p;
		bookCount++;
		}
	}
	
	public book(){
		bookCount++;
		
	}
	@Override
	public String toString() {
		return "book [bookNo=" + bookNo + ", title=" + title + ", author="
				+ author + ", price=" + price + "]";
	}
	public static int getBookCount( ){
		return bookCount;
	}

}
class Engineeringbook extends book{
	private String category 	;
	public Engineeringbook(){
		
	}

public Engineeringbook(String g){
		category=g;
	}
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
