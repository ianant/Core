package com.self.test.thread;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException  {
		ArrayListInsertAndRemove obj=new ArrayListInsertAndRemove();
		
		Runnable a=new Runnable(){
			public void run() {
				try {
					obj.additionList();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable b=new Runnable() {
			public void run() {
				try {
					obj.removeList();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread thread1=new Thread(a);
		Thread thread2=new Thread(b);
		
		thread1.start();
		thread1.sleep(10);
		
		thread1.join();
		thread2.start();
		thread2.sleep(10);
	}

}
