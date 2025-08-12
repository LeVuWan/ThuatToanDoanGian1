package com.vtd;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		float s = 0;

		for (int i = 1; i <= n; i++) {
			s = s + (float) 1 / i;
		}

		System.out.println("s = " + s);
	}
}
