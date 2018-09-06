package deadlock;

public class Lab000 {

	public static void main(String[] args) throws InterruptedException {
		MyThread th = new MyThread();
		Thread t1 = new Thread(th);
		Thread t2 = new Thread(th);
		System.out.println(t1.getState());
		t1.start();
		Thread.sleep(500);
		System.out.println(t1.getState());
		Thread.sleep(5000);
		System.out.println(t1.getState());
		t2.start();
		Thread.sleep(500);
		System.out.println(t2.getState());
		Thread.sleep(5000);
		System.out.println(t2.getState());
	}

}
class MyThread extends Thread{
	synchronized public void run(){
		Thread th = new Thread();
		for(int i=1;i<=3;i++){
			System.out.println(th.getName()+" -value is:"+i+"\t"+th.getState());
			try{
				Thread.sleep(500);	
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
