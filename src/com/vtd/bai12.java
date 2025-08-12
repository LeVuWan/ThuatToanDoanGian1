package com.vtd;

import java.util.Scanner;

public class bai12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		int k = 1;

		int i = 1;
		while (i <= n) {
			System.out.print(i * k + " ");
			k = k * -1;
			i = i * 2 + 1;
		}
	}
}
