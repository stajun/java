package day3;

public class Exam05 {

	public static void main(String[] args) {
		//Hello world 10번 출력하는 예제
		int i;
		for( i=1 ; i<=10 ; i++ ) {
			System.out.println("Hello world");	
		}
		
		System.out.println("==============");
		
		for( i=10 ; i>=1 ; i-- ) {
			System.out.println("Hello world");	
		}
		System.out.println("==============");
		//for문을 이용하여 1부터 10까지 출력하는 코드를 작성하세요.
		for( i=1 ; i<=10 ; i++ ) {
			System.out.println(i);	
		}
		System.out.println("==============");
		//1부터 10까지의 합을 구하는 코드를 for문을 이용하여 작성하세요.
		int sum = 0;
		/* sum = 0
		 * sum = sum + 1	i=1
		 * sum = sum + 2	i=2
		 * sum = sum + 3	i=3
		 * ...
		 * sum = sum + 10	i=10
		 * 반복횟수 : i가 1부터 10까지 1씩 증가
		 * 규칙 : sum = sum+i;
		 * 반복문 종료 후 : sum을 출력
		 */
		for(i=1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
