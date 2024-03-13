package programmers.addDigits;

public class AddDigits {

	public static void main(String[] args) {
		System.out.println(solution(1234));
	}
	
    public static int solution(int n) {
    	String[] input=String.valueOf(n).split(""); 
    	int answer = 0;
    	for (String tmp : input) {
			answer += Integer.parseInt(tmp);
		}

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

}
