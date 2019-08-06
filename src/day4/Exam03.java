package day4;

public class Exam03 {

	public static void main(String[] args) {
		/* 1부터 10까지 짝수의 합을 구하는 코드를 for문을 이용하여 작성해보세요.
		 * 반복횟수 : i는 1부터 10까지 1씩 증가
		 * 규칙성 : i를 2로 나누었을 때 나머지가 0과 같다면 sum += i;
		 * 반복문 종료 후 : sum을 출력
		 */
		int i, sum = 0;
		for(i=1; i<=10; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		/* 1부터 10까지 짝수의 합을 구하는 코드를 for문을 이용하여 작성해보세요.
		 * 반복횟수 : i는 2부터 10까지 2씩 증가
		 * 규칙성 : sum += i;
		 * 반복문 종료 후 : sum을 출력
		 */
		
		for(sum=0,i=2; i<=10; i = i+2) {
			sum+=i;
		}
		System.out.println(sum);
		/* 1부터 10까지 짝수의 합을 구하는 코드를 for문을 이용하여 작성해보세요.
		 * 반복횟수 : i는 1부터 10까지 1씩 증가
		 * 규칙성 : i가 홀수이면 스킵, sum += i;
		 * 반복문 종료 후 : sum을 출력
		 */
		
		for(sum=0,i=1; i<=10; i++) {
			if(i%2==1) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);

	}

}
