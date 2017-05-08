
public class boxingandun {
public static void main(String[] args) {
	//Boxing
	int val=10;
	Integer i= new Integer(val);
	
	//Unboxing
	int temp= i.intValue();
	System.out.println(temp);
	
	//String
	//Immutable
	String s="Tom";
	System.out.println(s.hashCode());
	s=s.concat("jerry");
	System.out.println(s.hashCode());
	//muttable
	StringBuffer sb1=new StringBuffer("Tom");
	System.out.println(sb1.hashCode());
	sb1=sb1.append("Jerry");
	System.out.println(sb1.hashCode());
	//Strig builder
	StringBuilder sb2=new StringBuilder("Tom");
	System.out.println(sb2.hashCode());
	sb2=sb2.append("Jerry");
	System.out.println(sb2.hashCode());
	
	}

}
