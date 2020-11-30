package com.java.hackerearth.basics.inout;

import java.util.Scanner;

/**
 * TASK
 * 
 * You have been given a positive integer N. You need to find and print the
 * Factorial of this number.
 * 
 **/

public class Factorial {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int temp = 1;

		for (int i = n; i >= 1; i--) {
			temp = temp * i;
		}

		System.out.println(temp);
		sc.close();
	}
}
