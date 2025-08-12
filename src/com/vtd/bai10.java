package com.vtd;

import java.util.Scanner;

public class bai10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		int a = 1;

		int b = 2;

		System.out.print(a + " " + b + " ");

		while ((a + b) <= n) {
			int temp = a;
			a = b;
			b = temp + b;
			System.out.print(b + " ");
		}
	}
}
