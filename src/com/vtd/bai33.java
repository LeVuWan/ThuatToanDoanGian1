package com.vtd;

import java.util.Scanner;

public class bai33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		int i = 1;
		do {
			int j = 1;
			do {
				if (Math.abs(n - j) <= (i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			} while (j < 2 * n);
			System.out.println();
			i++;
		} while (i <= n);
	}
}
