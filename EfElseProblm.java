package com.blz.day2problms;

import java.util.Scanner;

public class EfElseProblm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter single digit number");
		String[] arr = { "zero", "one", "two", "three", "four", "five", "six,", "seven","eight", "nine"};
		int a = sc.nextInt();
		if (a < 10){
			while (a != 0) {
				System.out.println("you have entered number:" +arr[a]);
				a = sc.nextInt();
			}
			System.out.println("program" +arr[a]);
			
		}else {
			System.out.println("not allow");
		}
			
	}
}
