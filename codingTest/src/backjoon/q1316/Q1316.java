package backjoon.q1316;

import java.util.HashMap;
import java.util.Scanner;

public class Q1316 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = Integer.valueOf(sc.nextLine());
		int countGroupWord = count;
		
		for(int i=0; i<count; i++) {
			String[] input = sc.nextLine().split("");
			HashMap<String, Integer> maps = new HashMap<>();
			
			for(int j=0;j<input.length;j++) {
				
				if (j == 0) {
					maps.put(input[j], maps.get(input[j]) == null ? 1:maps.get(input[j])+1);
				}else {
					if (input[j].equals(input[j-1]) || (!input[j].equals(input[j-1]) && !maps.containsKey(input[j]))) {
						maps.put(input[j], maps.get(input[j]) == null ? 1:maps.get(input[j])+1);
					}
				}
			}
			
			int countChar = 0;
			
			for(String tmp:maps.keySet()) {
				countChar += maps.get(tmp);
			}
			
			if (countChar != input.length) {
				countGroupWord--;
			}
//			System.out.println(maps);
		}
		
		System.out.println(countGroupWord);
	}

}
