package com.blz.day2problms;

public class Palindrome {
	public static void main(String[] args) {
		int no = 100;
		int temp = no;
		int rev = 0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+" The number is Palindrome");
		}
		else {
			System.out.println(no+" The number is not Palindrome");
		}
	}
}
