package com.vtd;

import java.util.Scanner;

public class bai9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		cach1(n);
		System.out.println();
		cach2(n);

	}

	private static void cach2(int n) {
		int i = 1;
		while(i <= n) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}

	private static void cach1(int n) {
		int i = 1;
		while(i <= n) {
				System.out.print(i + " ");
			i += 2;
		}
	}
}
