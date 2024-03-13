package programmers.stringToInteger;

public class StringToInteger {

	public static void main(String[] args) {
		System.out.println(solution("-1234"));

	}
	
    public static int solution(String s) {
        int answer = Integer.valueOf(s);
        return answer;
    }

}
