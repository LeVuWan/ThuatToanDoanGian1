package com.vtd;

import java.util.Scanner;

public class bai38 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = scanner.nextInt();

		int count = 2;
		int countIdx = 1;

		int i = 2;

		while (i <= n) {
			if (count == countIdx) {
				count++;
				countIdx = 1;
				System.out.print(-i + " ");
			} else {
				System.out.print(i + " ");
				countIdx++;
			}
			i += 2;
		}
	}
}
