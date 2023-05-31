package com.java.hackerrank.dashboard.basics;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * INPUT: A single double-precision number denoting
 * 
 * OUTPUT US: formattedPayment India: formattedPayment China: formattedPayment
 * France: formattedPayment
 **/
public class CurrencyFormatter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}