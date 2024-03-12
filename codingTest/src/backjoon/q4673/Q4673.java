package backjoon.q4673;

import java.util.HashSet;

public class Q4673 {

	public static void main(String[] args) {
		// 1은 2의 생성자 1(자기자신)+1(자릿수)
		// 2는 4의 생성자 2(자기자신)+2(자릿수)
		
		//셀프 넘버가 아닌 값 가져오기
//		Long beforeTime = System.currentTimeMillis();
		HashSet<Integer> numSet = new HashSet<Integer>();
		HashSet<Integer> selfNumSet = new HashSet<Integer>();

		for (int i = 1; i <= 10000; i++) {
			String str = i+"";
			int num = i;
			
			for (int j = 0; j < str.length(); j++) {
				num += Integer.parseInt(String.valueOf(str.charAt(j)));
			}
			
			selfNumSet.add(i);
			
			if (num <= 10000) {
				numSet.add(num);
			}
		}
		
		selfNumSet.removeAll(numSet);
//		System.out.println(allNumSet);
		for (Integer integer : selfNumSet) {
			System.out.println(integer);
		}
		
//		Long afterTime = System.currentTimeMillis();
//		System.out.println("작업시간 : "+(afterTime-beforeTime)/1000.0+"초"); //단위가 밀리세컨드
		
	}

}
