package manyGifts;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class ManyGifts {
	
	public static void main(String[] args) {
		String[] friends = {"muzi", "ryan", "frodo", "neo"};
		String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
		
		System.out.println(solution(friends, gifts));
	}
	
	public static int solution(String[] friends, String[] gifts) {
		HashMap<String, Integer> giverMaps = new HashMap<>();
		HashMap<String, Integer> recieverMaps = new HashMap<>();
		HashMap<String, Integer> giftPointMaps = new HashMap<>();
		HashMap<String, Integer> giftMaps = new HashMap<>();
		
		for (int i = 0; i < friends.length; i++) {
			giverMaps.put(friends[i], 0);
			recieverMaps.put(friends[i], 0);
			giftMaps.put(friends[i], 0);
		}
    	
    	for (int i = 0; i < gifts.length; i++) {
			String[] giftArray = gifts[i].split(" ");
			
			if (giverMaps.containsKey(giftArray[0]))
				giverMaps.put(giftArray[0], giverMaps.get(giftArray[0])+1);
				
			if (recieverMaps.containsKey(giftArray[1])) 
				recieverMaps.put(giftArray[1], recieverMaps.get(giftArray[1])+1);
			
			giftPointMaps.put(giftArray[0], giftPointMaps.get(giftArray[0]) == null ? 1 : giftPointMaps.get(giftArray[0])+1);
			giftPointMaps.put(giftArray[1], giftPointMaps.get(giftArray[1]) == null ? -1 : giftPointMaps.get(giftArray[1])-1);
    	}
    	
    	System.out.println("giverPoint = "+giverMaps.toString());
    	System.out.println("recievePoint = "+recieverMaps.toString());
    	System.out.println("giftPoint = "+giftPointMaps.toString());
    	
    	for (int i = 0; i < friends.length; i++) {
			for (int j = 0; j < friends.length; j++) {
				if (giverMaps.get(friends[i]) > recieverMaps.get(friends[j])) {
					if (!friends[i].equals(friends[j])) 
						giftMaps.put(friends[i], giftMaps.get(friends[i])+1);
					
				}
				
			}
		}
    	
    	System.out.println("gift = "+giftMaps.toString());
    	
    	
        int answer = Collections.max(giftMaps.values());
        return answer;
    }
}
