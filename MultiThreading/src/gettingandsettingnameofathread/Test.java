package gettingandsettingnameofathread;

public class Test {

	public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());
    MyThread t1 = new MyThread();
    System.out.println(t1.getName());
    Thread.currentThread().setName("TAMMINENI KRISHNA VAMSI");
    System.out.println(Thread.currentThread().getName());
    t1.start();
    for(int i =0;i<4;i++){
    	System.out.println("This is main Thread");
    }
	}
}

class MyThread extends Thread{
	public void run(){
		for(int i =0;i<4;i++){
		System.out.println("This is child thread");
	}
}}