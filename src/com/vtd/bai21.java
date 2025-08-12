package com.vtd;

import java.util.Scanner;

public class bai21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0) {
					System.out.print("B");
				} else {
					System.out.print("A");
				}
			}
			System.out.println();
		}
	}
}
