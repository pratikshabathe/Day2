package com.blz.day2problms;

public class Reverse {
	public static void main(String[] args) {
		int num = 231;
		int reversed = 0;
		
		for (;num != 0; num/=10) {
			int digit = num %10;
			reversed = reversed *10+digit;
		}
		System.out.println("reversed number:" +reversed);
	}
}
