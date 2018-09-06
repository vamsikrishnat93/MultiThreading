package priority;

public class Lab507 {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("KRISHNA");
		MyThread th1 = new MyThread(tg,"KUSHAL");
		MyThread th2 = new MyThread();
		th1.setPriority(10);
		th2.setPriority(5);
		th1.start();
		th2.start();
		

	}

}
class MyThread extends Thread{
	MyThread(ThreadGroup tg,String name){
		super(tg,name);
		
	}
	MyThread(){}
		public void run(){
			ThreadGroup tg = getThreadGroup();
			
		int pri = getPriority();
			
			for(int i=0;i<4;i++){
				System.out.println(i+"\t" + getName()+ "\t"+tg.getName()+"\t" +pri);
			}
		}
	}
