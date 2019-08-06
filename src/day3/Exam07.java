package day3;

public class Exam07 {

	public static void main(String[] args) {
		/* 정수 num가 소수인지 아닌지 판별하는 코드를 for문을 이용하여 작성하세요.
		 * 소수 : 약수의 갯수가 2개인 수
		 * 약수 : 나누어 떨어지는 수
		 * 15의 약수 : 1 3 5 15
		 * 3의 약수 : 1 3
		 * 반복횟수 : i는 1부터 num까지 1씩 증가 
		 * 규칙 : i가 num의 약수이면 약수의 갯수를 1증가
		 *    =>num를 i로 (나누었을 때 나머지)가 0과 (같으)(면) 약수의 갯수를 1증가
		 * 반복문 종료 후 : 약수의 갯수가 2개이면 소수라고 출력하고,
		 *             아니면 소수가 아님이라고 출력
		 */
		int num = 7;
		int i;
		int cnt = 0;
		for(i=1; i<=num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
		
		if(cnt == 2) {
			System.out.println("소수");
		}else {
			System.out.println("소수가 아님");
		}
		
	}

}
