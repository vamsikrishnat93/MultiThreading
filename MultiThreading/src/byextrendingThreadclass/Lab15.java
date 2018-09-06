package byextrendingThreadclass;

public class Lab15 {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		/*t.start();/if we are trying to restart the same thread,
		then we will runtime exception
		illegal thread state exception
*/
		for (int i = 0; i < 5; i++) {
			System.out.println("This is Main Thread");
		}
	}
}

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("This is Child Thread");
		}
	}
}