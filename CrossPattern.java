package com.BridgeLab;

public class CrossPattern {
	public static void main(String[] args) {
		CrossPattern.getPattern(5);
	}

	public static void getPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i == j) || (j == n - i + 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.printf("\n");
		}
	}
}
