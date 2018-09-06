package waitstate;

import java.util.ArrayList;

public class Lab599 {

	public static void main(String[] args) {
		A a1 = new A();
	MyThread1 th1 = new MyThread1(a1);
	MyThread1 th2 = new MyThread1(a1);
	th1.start();
	th2.start();

	}
}
class MyThread1 extends Thread{
	A a;
	MyThread1(A a){//constructor passing paramater
	this.a=a;
}
	public void run(){
		a.show();
	}
}
class A{
	// synchronized void show(){
void show(){
		ArrayList al = new ArrayList();
		Thread th = Thread.currentThread();
		synchronized(al){
		for(int i=0;i<5;i++){
			try{
				//wait(500);
			al.wait(500);//java.lang.IllegalMonitorException
			/*at java.lang.Object.wait(Native Method)
			at waitstate.A.show(Lab599.java:32)
			at waitstate.MyThread1.run(Lab599.java:22)*/
			System.out.println(th.getName()+"-KRISHNA:"+i+"\t"+this);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}}
}