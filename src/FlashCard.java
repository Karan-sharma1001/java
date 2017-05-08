import java.util.*;



public class FlashCard extends Card implements Comparable<ArrayList<FlashCard>>{
	private String subject;
	private String question;
	private String answer;

public FlashCard(String subject, String question, String answer) {
		super();
		this.subject = subject;
		this.question = question;
		this.answer = answer;
	}

@Override
public String toString() {
	return "FlashCard [subject=" + subject + ", question=" + question
			+ ", answer=" + answer + "]";
}

public FlashCard() {
	super();
}

public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void displayCard() {
System.out.println(this.subject+"  "+this.question+" "+" "+ this.answer);		
	}

public static void main(String[] args) {
	//Creation of array of FlashCard type
	ArrayList<FlashCard> a=new ArrayList<FlashCard>(5);
	Scanner n=new Scanner(System.in);
	//Storing Data in array
	  System.out.println("ENter values for flash card");
	  	for (int i = 0; i < 5; i++) {
		    a =new ArrayList<FlashCard>();
		    System.out.println("Enter Subject,question,answer");
		    a.add(new FlashCard(n.next(),n.next(),n.next()));
		  

	  	System.out.println(a);
	System.out.println("Sorted form");

	/*Collections.sort(a,new NameComparator());  
	for(FlashCard st: a){  
	System.out.println(st.subject+" "+st.question+" "+st.answer);  
	} */
		}
		
}

@Override
public int compareTo(ArrayList<FlashCard> o) {
	
	return 0;
}


}
