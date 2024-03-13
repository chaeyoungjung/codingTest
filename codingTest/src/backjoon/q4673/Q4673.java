package backjoon.q4673;

import java.util.HashSet;

public class Q4673 {

	public static void main(String[] args) {
		// 1�� 2�� ������ 1(�ڱ��ڽ�)+1(�ڸ���)
		// 2�� 4�� ������ 2(�ڱ��ڽ�)+2(�ڸ���)
		
		//���� �ѹ��� �ƴ� �� ��������
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
//		System.out.println("�۾��ð� : "+(afterTime-beforeTime)/1000.0+"��"); //������ �и�������
		
	}

}
