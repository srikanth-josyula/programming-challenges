package com.java.hackerearth.basics.inout;

import java.util.Scanner;

/**
 * You have been given an array A of size N consisting of positive integers. You
 * need to find and print the product of all the number in this array Modulo 10^9+7 .
 */

public class FindProduct {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		long pdt = 1;
		long m = 1000000007;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			pdt = (pdt * a[i]) % m;
		}
		System.out.println(pdt);
		sc.close();
	}
}
