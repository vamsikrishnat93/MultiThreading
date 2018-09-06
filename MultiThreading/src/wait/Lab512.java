package wait;
//this program refers to wait() method
public class Lab512 {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		//Hello h2 = new Hello();
		MyThread th1 = new MyThread(h1);
		MyThread th2 = new MyThread(h1);
		//MyThread th2 = new MyThread(h2);
		th1.start();
		th2.start();
	}

}
class MyThread extends Thread{
	Hello h;
	MyThread(Hello h){
		this.h=h;
	}
	public void run(){
		h.show();
	}
}
class Hello{
	 synchronized void show(){
		Thread th = Thread.currentThread();
		for(int i=0;i<5;i++){
			try{
				
				//Thread.sleep(200);
				System.out.println(th.getName()+"-KRISHNA:"+i+"\t"+this);
				wait(200);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}