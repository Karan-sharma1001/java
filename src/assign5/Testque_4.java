package assign5;

public class Testque_4 {
	public static void main(String[] args) {
        Storage st = new Storage();
        Counter c = new Counter(st);
        Printer p = new Printer(st);
        new Thread(c,"Counter").start();  //start the counter
        new Thread(p,"Printer").start();   //start the printer
  }
	

}
