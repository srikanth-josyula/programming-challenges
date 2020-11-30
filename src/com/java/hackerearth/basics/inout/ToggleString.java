package com.java.hackerearth.basics.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * TASK
 * 
 * You have been given a String S consisting of uppercase and lowercase English
 * alphabets. You need to change the case of each alphabet in this String. That
 * is, all the uppercase letters should be converted to lowercase and all the
 * lowercase letters should be converted to uppercase. You need to then print
 * the resultant String to output. Input : abcdE Output : ABCDe
 **/

public class ToggleString {

	public static void main(String args[]) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		String str2 = "";

		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c))
				str2 = str2 + Character.toLowerCase(c);
			else
				str2 = str2 + Character.toUpperCase(c);
		}

		System.out.println(str2);
	}

}
