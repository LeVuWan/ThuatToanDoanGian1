package com.vtd;

import java.util.Scanner;

public class bai27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		int i = 1;

		while (i <= n) {
			int j = 1;
			while (j < n * 2) {
				if (Math.abs(n - j) <= (i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
