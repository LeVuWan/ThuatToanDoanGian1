package com.vtd;

import java.util.Scanner;

public class bai35 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		while (n > 0) {
			System.out.println(n % 2);
			n = n / 2;
		}
	}
}
