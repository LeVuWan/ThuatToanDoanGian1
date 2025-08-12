package com.vtd;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		cach1(n);
		System.out.println();
		cach2(n);

	}

	private static void cach2(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

	private static void cach1(int n) {
		for (int i = 1; i <= n; i = i + 2) {
			System.out.print(i + " ");
		}
	}
}
