package day4;

public class Exam06 {

	public static void main(String[] args) {
		/* 1부터 100까지 소수를 출력하는 코드를 이중 반복문을 이용하여
		 * 작성하세요.
		 * 1. 소수 판별 예제를 이용하여 정수 num가 소수이면 num를 출력하는
		 *    코드를 작성
		 * 2. num를 1부터 100까지 1씩 증가하는 반복문을 작성후 
		 *    실행문으로 1번에서 작성한 코드를 넣어줌
		 */
		int num = 10;
		int i, cnt = 0;
		
		for(num=1; num<=100; num++) {
			for(i=1,cnt=0; i<=num; i++) {
				if(num % i == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				System.out.print(num+" ");
			}
		}
	}
}
