
public interface AccountInter {
	public void create( int accNo,  String name, double accBal );// – method to create an account

	public double delete( int accNo );// – method to delete an account passed as parameter
	public void print ( int accNo );// – method to print details of an account passed as parameter

}
