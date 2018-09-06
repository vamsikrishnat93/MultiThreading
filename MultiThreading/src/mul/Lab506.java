package mul;



public class Lab506 {
public static void main(String[] args) {
		MyRunnable r =  MyRunnable();
	
		Thread t1 = new Thread(r);
		//Thread t2 = new Thread(r);
		t1.start();
		
		Thread t = Thread.currentThread();
		for(int i=100;i<105;i++){
			System.out.println(t.getName()+"-value is:" +i);
		}

		try{
			Thread.sleep(100);
		}
		catch(Exception e){
			e.printStackTrace();

		}}
	private static MyRunnable MyRunnable() {
	// TODO Auto-generated method stub
	return null;
}
	class MyRunnable implements Runnable{
		public void run(){
			Thread th = Thread.currentThread();
			for(int i=1;i<=10;i++){
				System.out.println(th.getName()+"-value is:" +i);
			}
			try{
				Thread.sleep(200);
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}}}
	