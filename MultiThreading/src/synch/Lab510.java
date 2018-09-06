package synch;
//this program refers to blocklevel synchronization
public class Lab510 {
	public static void main(String[] args) {
		Hello h1 = new Hello();
		Hello h2 = new Hello();
		MyThread th1 = new MyThread(h1);
		MyThread th2 = new MyThread(h1);
		//MyThread th= new MyThread(h2);
		th1.start();
		th2.start();
	}
}
class MyThread extends Thread{
	Hello h = null;
	MyThread(Hello h){
		this.h=h;
	}
	public void run(){
		h.show();
	}
}
class Hello{
	 void show(){
		Thread th = Thread.currentThread();
		synchronized(this){// this one is refers to block level synchronized
		for(int i=0;i<5;i++){
			System.out.println(th.getName()+" -KRISHNA:"+i+"\t"+this);
			try{
				Thread.sleep(100);

			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
}}}
