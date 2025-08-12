package com.vtd;

import java.util.Scanner;

public class bai11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.print(i + " ");
			i = i * 2 + 1;
		}
	}

}
