package backjoon.q11382;

import java.util.Scanner;

public class Q11382 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] inputArr = input.split(" ");
		
		Long answer = 0L;
		
		for(String tmp:inputArr) {
			answer += Long.valueOf(tmp);
		}
		System.out.println(answer);
		
	}

}
