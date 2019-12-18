package com.csi.CollectionConcepts;


class MyThread extends Thread
{
	public void run()
	{
		int i;
		for(i=1; i<=5; i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println("CSI");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
		}
	}
}
public class ExtendThreads {
	
	public static void main(String[] args) {
		
		MyThread m=new MyThread();
		m.start();
		m.start();//  illegal thread state exception
	}

}
