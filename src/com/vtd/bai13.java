package com.vtd;

import java.util.Scanner;

public class bai13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter m: ");
		int m = scanner.nextInt();
		int tong = 0;
		int tich = 1;

		while (m > 0) {
			int i = m % 10;
			m = m / 10;
			tong = tong + i;
			tich = tich * i;
		}
		System.out.println("Tong: " + tong);
		System.out.println("Tich: " + tich);
	}
}
