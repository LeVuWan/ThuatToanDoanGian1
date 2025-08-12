package com.vtd;

import java.util.Scanner;

public class bai30 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		int a = 1;
		int b = 2;

		System.out.print(a + " ");
		System.out.print(b + " ");

		do {
			int temp = a;
			a = b;
			b = a + temp;
			System.out.print(b + " ");
		} while (a + b <= n);
	}
}
