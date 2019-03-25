package bai87_datientrinh_runnable.com.test;

import bai86_datientrinh_thread.com.model.MyThread;

public class TestMyThread {
	public static void main(String[] args) {
	MyThread run1= new MyThread();
	MyThread run2= new MyThread();
	MyThread run3= new MyThread();
	
	Thread th1= new Thread(run1);
	th1.setName("Tien trinh a");
	Thread th2= new Thread(run2);
	th2.setName("Tien trinh b");
	Thread th3= new Thread(run3);
	th3.setName("Tien trinh c");
	
	th1.start();
	th2.start();
	th3.start();
}
}
