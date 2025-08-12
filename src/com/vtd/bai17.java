package com.vtd;

import java.util.Scanner;

public class bai17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		double s = 0;

		for (int i = 1; i <= n; i++) {
			double k = 1;
			for (int j = 1; j <= i; j++) {
				k *= j;
			}
			s += 1.0 / k;
		}

		System.out.println("S = " + s);
	}
}
