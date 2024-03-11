package manyGifts;

import java.util.HashMap;

public class ManyGifts {
	
	public static void main(String[] args) {
		String[] friends = {"muzi", "ryan", "frodo", "neo"};
		String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
		
		System.out.println(solution(friends, gifts));
	}
	
	public static int solution(String[] friends, String[] gifts) {
    	
    	HashMap<String, Integer> maps = new HashMap<>();
    	
    	for (int i = 0; i < gifts.length; i++) {
			String[] giftArray = gifts[i].split(" ");
			maps.put(giftArray[0], maps.get(giftArray[0]) == null ? 1 : maps.get(giftArray[0])+1);
			
			System.out.println(maps.toString());
			
		}
    	
        int answer = 0;
        return answer;
    }
}
