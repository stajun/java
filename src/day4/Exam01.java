package day4;

public class Exam01 {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 구하는 코드를 for문을 이용하여 작성하세요.
		 * 최대 공약수 : 두 수의 공약수중 가장 큰 수
		 * 공약수 : 두 수의 약수중 공통으로 있는 약수
		 * 약수 : 나누어 떨어지는 수
		 * 8의 약수 : 1 2 4 8
		 * 12의 약수 : 1 2 3 4 6 12
		 * 8과 12의 공약수 : 1 2 4
		 * 8과 12의 최대 공약수 : 4
		 * 두 정수 => num1, num2
		 * 반복횟수 : i는 1부터 num1까지 1씩 증가
		 * 규칙성 : i가 num1과 num2의 공약수이면 공약수를 저장하는 변수 gcd에 i를 저장
		 * 		 num1을 i로 (나누었을 때 나머지)가 0과(같)(고)
		 * 		 num2를 i로 (나누었을 때 나머지가) 0과 (같다)(면)
		 * 		 gcd에 i를 저장
		 * 반복문 종료 후 : gcd를 출력
		 */
		int num1 = 7, num2 = 12;
		int i;
		int gcd=1;
		for(i=1; i<=num1 ;i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
		/* 두 정수가 서로소인지 아닌지 판별하는 코드를 작성하세요.
		 * 서로소 : 두 수의 최대 공약수가 1인 두수 의 관계
		 * 최대 공약수가 1이면 서로소, 1이 아니면 서로소가 아님이라고 출력
		 */
		if(gcd == 1) {
			System.out.println("두수는 서로소");
		}else {
			System.out.println("두수는 서로소 아님");
		}
	}

}
