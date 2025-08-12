package com.vtd;

import java.util.Scanner;

public class bai23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

//		hinh1(n);
		hinh7(n);
	}

	private static void hinh1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void hinh2(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void hinh3(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void hinh4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void hinh5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (j == 0 || j == n - i - 1 || i == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void hinh6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n * 2; j++) {
				if (Math.abs(n - j) <= (i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void hinh7(int n) {
	    for (int i = n; i >= 1; i--) { 
	        for (int j = 1; j < n * 2; j++) {
	            if (Math.abs(n - j) <= (i - 1)) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}

}
