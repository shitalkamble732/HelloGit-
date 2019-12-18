package com.csi.jdkFeatures;

interface Square
{
	int calculate(int x);
}
class SquareEx implements Square
{

	@Override
	public int calculate(int x) {
		// TODO Auto-generated method stub
		int ans=x*x;
		return ans;
	}
	
}
public class FunctInterfaceEx {
	
	public static void main(String[] args) {
		
		int a=5;
		Square s=(int x)->x*x;            //lambda Expression
		int ans=s.calculate(a);
/*	Square ex=(int x)->x*x;
	
		  System.out.println("Square of 5 : "+ex.calculate(5));
		}
	}
*/
		
		System.out.println("Square of 5 : "+ans);
		
	}
}

