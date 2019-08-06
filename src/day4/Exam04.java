package day4;

public class Exam04 {

	public static void main(String[] args) {
		/* 두 정수의 최소 공배수를 구하는 코드를 작성하세요.
		 * 최소공배수 : 두 수의 공배수중 가장 작은 공배수
		 * 공배수 : 두 수의 배수중 공통으로 있는 수
		 * 배수 : 나누어떨어지는 수,
		 * 10의 배수 : 10, 20, 30, 40, 50, 60, ...
		 * 15의 배수 : 15, 30, 45, 60, 75, 90, ...
		 * 10과 15의 공배수 : 30, 60, 90, 120, ...
		 * 10과 15의 최소공배수 : 30
		 * 반복횟수 : i는 1부터 num1*num2까지 1씩 증가
		 * 규칙성 : i가 num1의 배수이고, i가 num2의 배수이면
		 *       =>i를 num1으로 (나누었을 때 나머지)가 0과 (같)(고)
		 *         i를 num2로 (나누었을 때 나머지)가 0과 (같다)(면) 
		 * 		  lcm에 i를 저장 후 반복문 강제 종료
		 * 반복문 종료 후 : lcm을 출력
		 */
		int num1 = 10, num2 = 15;
		int i;
		int lcm = 1;
		for(i=1; i<=num1*num2; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				lcm = i;
				break;
			}
		}
		System.out.println(lcm);
		/* 반복횟수 : i는 num1부터 num1*num2까지 num1씩 증가
		 * 규칙성 : i가 num2의 배수이면
		 *       =>i를 num2로 (나누었을 때 나머지)가 0과 (같다)(면) 
		 * 		  lcm에 i를 저장 후 반복문 강제 종료
		 * 반복문 종료 후 : lcm을 출력
		 */
		for(i=num1; i<=num1*num2; i = i + num1) {
			if(i % num2 == 0) {
				lcm = i;
				break;
			}
		}
		System.out.println(lcm);
	}

}






