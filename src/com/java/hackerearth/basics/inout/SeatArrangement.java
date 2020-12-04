package com.java.hackerearth.basics.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * You will be given a seat number+ find out the seat number facing you and the
 * seat type+ i.e. Window Seat :WS+ Middle Seat : MS or Aisle Seat : AS. InPUT :
 * First line of input will consist of a single integer T denoting number of
 * test-cases. Each test-case consists of a single integer n denoting the
 * seat-number. 
 * 
 * OUTPUT : For each test case+ print the facing seat-number and
 * the seat-type+ separated by a single space in a new line.
 */

public class SeatArrangement {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		int key = 0;
		int n = 0;
		for (int i = 1; i <= T; i++) {
			n = Integer.parseInt(in.readLine());
			key = (n % 12);
			switch (key) {
			case 0:
				n -= 11;
				System.out.println(n+" WS" );
				break;
			case 1:
				n += 11;
				System.out.println(n+" WS" );
				break;
			case 2:
				n += 9;
				System.out.println(n+" MS" );
				break;
			case 3:
				n += 7;
				System.out.println(n+" AS" );
				break;
			case 4:
				n += 5;
				System.out.println(n+" AS" );
				break;
			case 5:
				n += 3;
				System.out.println(n+" MS" );
				break;
			case 6:
				n += 1;
				System.out.println(n+" WS" );
				break;
			case 7:
				n -= 1;
				System.out.println(n+" WS" );
				break;
			case 8:
				n -= 3;
				System.out.println(n+" MS" );
				break;
			case 9:
				n -= 5;
				System.out.println(n+" AS" );
				break;
			case 10:
				n -= 7;
				System.out.println(n+" AS" );
				break;
			case 11:
				n -= 9;
				System.out.println(n+" MS" );
				break;

			}
		}
	}
}
