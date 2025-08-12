package com.vtd;

import java.util.Scanner;

public class bai7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.println("Result: " + result);
	}
}
