package com.java.hackerearth.basics.inout;

/**
 *Input contains integer N, the number of steps in the ladder 
 * Print the ladder with the gap between two side rails being 3 spaces(“   “).
 * Check the sample output for format of printing the ladder.
 **/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ladderophilia {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(in.readLine());
		while (val > 0) {
			for (int i = 0; i < 2; i++) {
				System.out.println("*   *");
			}
			System.out.println("*****");
			val--;
		}
		for (int i = 0; i < 2; i++)
			System.out.println("*   *");
	}
}
