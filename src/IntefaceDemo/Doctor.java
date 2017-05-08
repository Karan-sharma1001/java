package IntefaceDemo;
import java.util.*;
public class Doctor implements Myinterface{
	Scanner s=new Scanner(System.in);
	public void getData() {
		System.out.println("Enter name of Doctor");
		this.name=s.next();
		System.out.println("Enter Degree");
		this.degree=s.next();
	}
	public void putData(){
		System.out.println("The name of Doctor is "+this.name+"  and Degre is "+this.degree);
		}

	
	private String degree;
	private String name;
	
	

}
