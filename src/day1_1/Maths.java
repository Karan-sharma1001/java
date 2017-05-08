package day1_1;

public class Maths {
//Method overloading;
	int add(int n1,int n2){
		return (n1+n2);
		
	}

	
	double add(double n1,int n2){
		return (n1+n2);
		
	}

	
	float add(int n1,float n2){
		return (n1+n2);
		
	}
	
	public static  void main(String [ ] args) {
		
		
		Maths m=new Maths();
		System.out.println(m.add(10, 10));
		System.out.println(m.add(10,3.4f));
		System.out.println(m.add(32.89, 5));
		
		}
	
	
	
	
}
