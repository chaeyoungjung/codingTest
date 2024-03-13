package backjoon.q2444;

import java.util.Scanner;

public class Q2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer input = sc.nextInt();
		String star = "*";
		Integer count = 0;
		
		for (int i = 0; i < input; i++) {
			count = 1+2*i;
			for (int k = 1; k < input-i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < count; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		for (int i = 1; i < input; i++) {
			count -= 2;
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < count; j++) {
				System.out.print("*");
			}

			System.out.println();
		}


	}

}
