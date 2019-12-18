package com.csi.CollectionConcepts;

class Table
{
   public void printTable(int n)
	{
		int i;
		//int n=5;
		for(i=1; i<=5; i++)
		{
			try {
				
				Thread.sleep(1000);
				System.out.println(i*n);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println();
		}
	}
}
class Mythread2 extends Thread
{
    Table t;
	public Mythread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
class MyThread3 extends Thread
{
	Table t;
	public MyThread3(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(1000);
	}
}
class MyThread4 extends Thread
{
	Table t;
	public MyThread4(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(10000);
	}
}
public class SyncThread {

	public static void main(String[] args) {
		
		Table t1= new Table();
		Mythread2 m2 = new Mythread2(t1);
		MyThread3 m3=new MyThread3(t1);
		MyThread4 m4= new MyThread4(t1);
		m2.start();
		m3.start();
		m4.start();
		
	}
}
