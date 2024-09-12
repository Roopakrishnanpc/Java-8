package com.leetcode;

public class SolutionIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(10));
		boolean result=isPalindrome(121);
		if(result==true)
		{
			System.out.println("Is Paidrome");
		}
		else
		{
			System.out.println("Is not Paidrome");
		}
		
	}
	public static boolean isPalindrome(int x) {
		if(x<0)
		{
			return false;
		}
		int y=0;
		int xx=x;
		while(x>0)
		{			
			int s=x%10;		   
		    y= y*10+s;
		    
		    x=x/10;
		}		
		if(xx==y)
			return true;
	    return false;
}
	
}
