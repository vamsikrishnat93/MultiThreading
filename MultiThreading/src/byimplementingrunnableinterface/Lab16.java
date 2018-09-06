package byimplementingrunnableinterface;

public class Lab16 {

	public static void main(String[] args) {
         int n=4;//no.of threads
         for(int i=0;i<4;i++){
        	 MyThreadDemo r = new MyThreadDemo();
        	 Thread t = new Thread(r);
        	 t.start();
         }
	}
}
class MyThreadDemo implements Runnable{
	public void run(){
		try{
			System.out.println("Thread"+Thread.currentThread().getId()+"is running");
		}
		catch(Exception e){
			System.out.println("Exception is Catch");
		}
	}
}