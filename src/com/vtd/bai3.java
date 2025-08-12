package com.vtd;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		for (int i = 2; i <= 2 * n; i = i + 2) {
			System.out.println(i + " ");
		}
	}
}
