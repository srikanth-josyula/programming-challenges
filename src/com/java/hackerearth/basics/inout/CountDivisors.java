package com.java.hackerearth.basics.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * You have been given 3 integers - l, r and k. Find how many numbers between l
 * and r (both inclusive) are divisible by k. You do not need to print these
 * numbers, you just have to find their count. 
 * Input : 1 10 1 
 * Output : 10
 **/
public class CountDivisors {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] strArry = in.readLine().split(" ");
		int count = 0;
		int l = Integer.parseInt(strArry[0]);
		int r = Integer.parseInt(strArry[1]);
		int k = Integer.parseInt(strArry[2]);
		for (int i = l; i <= r; i++) {
			if(i%k==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
