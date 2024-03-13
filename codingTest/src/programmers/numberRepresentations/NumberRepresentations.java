package programmers.numberRepresentations;

public class NumberRepresentations {

	public static void main(String[] args) {
		Long beforeTime = System.currentTimeMillis();
		System.out.println(solution(15));
		Long afterTime = System.currentTimeMillis();
		System.out.println((afterTime-beforeTime)/1000.00+"초");
	}
	
////효율성 테스트  fail	
//    public static int solution(int n) {
//        int answer = 0;
//        
//        for(int j=1; j<=n;j++) {
//        	int sum = 0;
//        	
//        	for(int i=0+j; i<=n; i++) {
//        		sum += i;
//        		if(sum == n) {
//        			System.out.println("count check, i = "+i+" j = "+j);
//        			answer++;
//        		}
//        	}
//        }
//        return answer;
//    }
	
	  public static int solution(int n) {
		  int answer = 0;
		  
		  return answer;
	}
	
	

}
