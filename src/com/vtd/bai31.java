package com.vtd;

import java.util.Scanner;

public class bai31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.println(i + " - " + j);
				j++;
			} while (j <= n);
			i++;
		} while (i <= n);
	}
}
