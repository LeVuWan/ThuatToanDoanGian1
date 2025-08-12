package com.vtd;

import java.util.Scanner;

public class bai37 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		int k = 1;
		if (n < 2) {
			System.out.println("Nhap sai");
		}

		for (int i = 2; i <= n; i += 2) {
			System.out.print(i * k + " ");
			k = k * -1;
		}
	}
}
