package com.csi.oops;
/*
class This{  
	int rollno;  
	String name;  
	float fee;  
	This(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);}  
	}  
public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			This s1=new This(111,"ankit",5000f);  
			This s2=new This(112,"sumit",6000f);  
			s1.display();  
			s2.display();  
	}

}
*/

class Animal{  
void eat()
{
	System.out.println("eating...");}  
}  
class Dog extends Animal{  
void eat()
{
	System.out.println("eating bread...");
	}  
void bark()
{
	System.out.println("barking...");
	}  
void work()
{  
super.eat();  
bark();  
}  
}  
class ThisKeyword{  
public static void main(String args[]){  
Dog d=new Dog();  
d.work();
}}  
