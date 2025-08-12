package com.vtd;

import java.util.Scanner;

public class Bai20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i % 2 == 0) {
					System.out.print("B");
				} else {
					System.out.print("A");
				}
			}
			System.out.println();
		}
	}
}
