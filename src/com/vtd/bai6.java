package com.vtd;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		cach2(n);
	}

	private static void cach1(int n) {
		int k = 1;

		for (int i = 2; i <= n; i += 2) {
			System.out.print(i * k + " ");
			k = k * -1;
		}
	}

	private static void cach2(int n) {
		int k = 1;

		for (int i = 2; i <= n; i++) {
			if (i % 4 == 0) {
				System.out.print(-i);
			} else if (i % 2 == 0) {
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}
}
