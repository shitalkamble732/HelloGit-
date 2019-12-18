package com.csi.CollectionConcepts;

class Thread1  extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("Start method");
	}
	public void run()
	{
		System.out.println("its a run method..");
	}
}
public class StartMethod {
	public static void main(String[] args) {
		
		Thread1 e = new Thread1();
		e.start();
		System.out.println("It's a main thread...");
	}

}
