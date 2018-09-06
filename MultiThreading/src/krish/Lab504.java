package krish;

public class Lab504 {


	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		Thread t = Thread.currentThread();
		for(int i=5;i<=6;i++){
			System.out.println(t.getName()+" -value is:" +i);
			try{
				Thread.sleep(40);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class MyThread extends Thread{
	public void run(){
		Thread th = Thread.currentThread();
		for(int i=1;i<=5;i++){
			System.out.println(th.getName()+" -value is:" +i);
			try{
				Thread.sleep(50);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

