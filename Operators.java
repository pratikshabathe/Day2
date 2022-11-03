package com.blz.day2problms;

public class Operators {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int result = a + b * c;
		int result1 = c + a/b;
		int result2 = a%b+c;
		int result3 = a*b+c;
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		if (result > result1 && result > result2 && result > result3) {
			System.out.println("maxi number : " + result);
		} else if (result1 > result2 && result1 > result3 && result1 > result) {
			System.out.println("maxi number : " + result1);
		} else if (result2 > result1 && result2 > result3 && result2 > result) {
			System.out.println("maxi number : " + result2);

		} else {
			System.out.println("maxi number : " + result3);
		}

		
		if (result < result1 && result < result2 && result < result3) {
			System.out.println("mini number : " + result);
		} else if (result1 < result2 && result1 < result3 && result1 < result) {
			System.out.println("mini number : " + result1);
		} else if (result2 < result1 && result2 < result3 && result2 < result) {
			System.out.println("mini number : " + result2);

		} else {
			System.out.println("mini number : " + result3);
		
		}
	}
}
