package com.java.hackerearth.basics.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbers {
	public static void main(String args[]) throws IOException {
		String primeNumbers = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		for (int i = 0; i <= num; i++) {
			int counter = 0;
			for (int n = 1; n <= i; n++) {
				if (i % n == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println(primeNumbers);
	}
}
