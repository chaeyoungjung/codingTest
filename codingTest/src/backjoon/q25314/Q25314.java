package backjoon.q25314;

import java.util.Scanner;

public class Q25314 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		String longStr = "";
		
		for(int i=0 ; i<input/4 ; i++) {
			longStr += "long ";
		}
		
		System.out.println(longStr+"int");
	}

}
