
public class DisplayThread extends Thread {
DisplayThread(){
	System.out.println("Thread is created "+Thread.currentThread().getName());
}

@Override
	public void run() {
			super.run();
			System.out.println("Thread is running "+Thread.currentThread().getName());
}
}
