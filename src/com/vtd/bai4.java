package com.vtd;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		int s = 0;

		for (int i = 1; i <= n; i++) {
			s += i;
		}
		
		System.out.println("S = " + s);
	}
}
