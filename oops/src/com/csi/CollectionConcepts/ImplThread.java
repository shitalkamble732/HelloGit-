package com.csi.CollectionConcepts;


class MyThread1 implements Runnable {
	
	public void run() {
		
		System.out.println("CSI");
	}
}
public class ImplThread   {
	
	public static void main(String[] args) {
		
		MyThread m=new MyThread();
		Thread tt=new Thread(m) ;
		tt.start();
		}

}
