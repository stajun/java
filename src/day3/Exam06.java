package day3;

public class Exam06 {

	public static void main(String[] args) {
		//구구단 중 7단을 출력하는 코드를 for문을 이용하여 작성하세요.
		/* 출력 예시
		 * 7 x 1 = 7
		 * 7 x 2 = 14
		 * 7 x 3 = 21
		 * ...
		 * 7 x 9 = 63
		 * 반복횟수 : i는 1부터 9보다 작거나 같을 때까지 1씩 증가
		 * 규칙(실행문) : num x i = num*i
		 * 반복문 종료 후 : 없음
		 */
		int num = 2;
		int i;
		for(i=1; i<=9; i++) {
			System.out.println(""+num+"X"+i+"="+ num*i);
		}
		
	}

}
