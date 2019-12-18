package com.csi.CollectionConcepts;

	
public class ThreadMethods extends Thread{
	
		public void run()
		{
			System.out.println("Running the Thread....");
			System.out.println("Current thread Name : "+Thread.currentThread().getName());
		}
		
	public static void main(String[] args) {
		
		ThreadMethods m1=new ThreadMethods();
		ThreadMethods m2= new ThreadMethods();
		
	    System.out.println("Thread Name : "+m1.getName());
	    System.out.println("Thread Id : "+m1.getId());
	    System.out.println("THread Priority Bydefault : "+m1.getPriority());
	    m2.setPriority(MAX_PRIORITY);
	    System.out.println("M2 Priority : "+m2.getPriority());
	    m2.setName("JERRY...");
	    System.out.println("Thread Name given by User : "+m2.getName());
	    
	    m1.start();
	    m2.start();
	}
	}
	
	



