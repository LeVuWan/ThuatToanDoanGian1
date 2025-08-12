package com.vtd;

import java.util.Scanner;

public class bai38 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = scanner.nextInt();

		int i = 2;

		int negativePosition = 2;

		int nextPositon = 3;

		int count = 1;

		while (i <= n) {
			if (count == negativePosition) {
				System.out.println(-i + " ");
				negativePosition = negativePosition + nextPositon;
				nextPositon++;
			} else {
				System.out.println(i + " ");
			}

			i += 2;
			count++;
		}
	}
}
