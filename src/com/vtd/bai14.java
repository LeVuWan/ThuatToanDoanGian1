package com.vtd;

import java.util.Scanner;

public class bai14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = scanner.nextInt();

		System.out.print("Enter b: ");
		int b = scanner.nextInt();

		int r1 = ucln(a, b);

		System.out.println(r1);

		int r2 = bcnn(a, b);

		System.out.println(r2);
	}

	private static int bcnn(int a, int b) {
		if (a == 0) {
			return b;
		}

		if (b == 0) {
			return a;
		}
		int n = a + b;

		while (true) {
			if (n % a == 0 & n % b == 0) {
				return n;
			}
			n++;
		}
	}

	private static int ucln(int a, int b) {
		int n = a < b ? a : b;
		int result = 1;

		for (int i = 2; i <= n; i++) {
			if (a % i == 0 && b % i == 0) {
				result = i;
			}
		}
		return result;
	}
}
