import java.util.Scanner;


public class AccountDemo {
public static void main(String[] args) {
	Account [ ] account=new Account[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Account are created");
	
	
	for (int i = 0; i < account.length; i++) {
		account[i]=new Account();
		System.out.println("Enter values for account=> Accno,Name,Balance "+i);
		account[i].create(sc.nextInt(), sc.next(), sc.nextDouble());
	}
	
	
	
	System.out.println("Enter account no to view details");
	int x=sc.nextInt();
	for (int i = 0; i < account.length; i++) {
		if (account[i].getAccNo()==x){
			System.out.println(account[i]);
		}
		
		
	System.out.println("Enter account no to be deleted");
	x=sc.nextInt();
	int c=0;
	for ( i = 0; i < account.length; i++)
	{
		if (account[i].getAccNo()==x){
			account[i].delete(x);
			if(i<(account.length-1))
					account[i]=account[i+1];
					c=1;
													}
	if(c==1){
			if( i < (account.length-1) ){
			account[i]=account[i+1];
														}
						}

	}
	for ( i = 0; i < (account.length-1); i++) {
	System.out.println(account[i]);
}
	}
}
}

