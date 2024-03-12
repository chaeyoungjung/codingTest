package backjoon.q1010;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1010 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String inputTestCase = sc.nextLine();
		Integer testCaseInt = Integer.parseInt(inputTestCase);
		
		String[] inputArray = new String[testCaseInt];
		
		for (int i = 0; i < testCaseInt; i++) {
			String input = sc.nextLine();
			inputArray[i] = input;
		}
		
		for (String site : inputArray) {
			String[] siteArray = site.split(" ");
			Integer n = Integer.parseInt(siteArray[0]);
			Integer m = Integer.parseInt(siteArray[1]);
			BigInteger output = new BigInteger("0");
			
			BigInteger a = new BigInteger(m+"");
			BigInteger b = new BigInteger((m-n)+"");
			BigInteger c = new BigInteger(n+"");
			
			for (int i = 1; i < m; i++) {
				a = a.multiply(new BigInteger((m-i)+""));
			}
			for (int i = 1; i < n; i++) {
				c = c.multiply(new BigInteger((n-i)+""));
			}
			for (int i = 1; i < (m-n); i++) {
				b = b.multiply(new BigInteger(((m-n)-i)+""));
			}
			if (b.compareTo(new BigInteger("0")) == 0) {
				b = new BigInteger("1");
			}
			output = a.divide(b.multiply(c));
			
			System.out.println(output);
		}
		
	}

}
