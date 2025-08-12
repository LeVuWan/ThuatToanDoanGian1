package com.vtd;

import java.util.Scanner;

public class bai36 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Nhap n: ");
			int n = scanner.nextInt();

			if (n > 0) {
				break;
			}
			System.out.println("Hay nhap lai");
		} while (true);
		System.out.println("Nhap thanh cong");
	}
}
