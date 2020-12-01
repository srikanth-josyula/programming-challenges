package com.java.hackerearth.basics.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Now Roy has N photos of various dimensions. Dimension of a photo is denoted
 * as W x H where W - width of the photo and H - Height of the photo When any
 * photo is uploaded following events may occur: [1] If any of the width or
 * height is less than L, user is prompted to upload another one. Print "UPLOAD
 * ANOTHER" in this case [2] If width and height, both are large enough and (a)
 * if the photo is already square then it is accepted. Print "ACCEPTED" in this
 * case (b) else user is prompted to crop it. Print "CROP IT" in this case.
 * Input: First line contains L. Second line contains N, number of photos.
 * Following N lines each contains two space separated integers W and H.
 * 
 * INPUT: 180 3 640 480 120 300 180 180
 * 
 * OUTPUT : CROP IT UPLOAD ANOTHER ACCEPTED
 **/

public class RoyandProfilePicture {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(in.readLine());
		int N = Integer.parseInt(in.readLine());
		List<String> sA = new ArrayList<String>();
		for (int i = 1; i <= N; i++) {
			sA.add(in.readLine());
		}
		for (String s : sA) {
			int W = Integer.parseInt(s.split(" ")[0]);
			int H = Integer.parseInt(s.split(" ")[1]);
			if (W < L || H < L)
				System.out.println("UPLOAD ANOTHER");
			else if (W == H)
				System.out.println("ACCEPTED");
			else
				System.out.println("CROP IT");
		}
	}
}
