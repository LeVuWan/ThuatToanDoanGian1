package com.vtd;

import java.util.Scanner;

public class bai28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= n);
	}
}
