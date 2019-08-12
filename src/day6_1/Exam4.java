package day6_1;

import day6.Test;

public class Exam4 {

	public static void main(String[] args) {
		Test t = new Test();
		t.num1 = 10;
		//t.num2 = 20;
		//t.num3 = 30;
		
		int res = sum(1,2);
		System.out.println(res);
		int num1 = 8, num2 = 12;
		res = gcd(num1, num2);
		System.out.println(""+num1+"과 "+num2+"의 최대공약수 : "+res);
		
		System.out.println(sum2(1,2,3,4));
		int arr[] = {1,2,3,4};
		System.out.println(sum3(arr));
		//자료형 배열명[] = new 자료형[]{초기값};
		//익명 배열을 생성하여 매개변수로 전달
		System.out.println(sum3(new int[] {1,2,3,4}));
		
		printHello();
		//int num = printHello();//에러 발생
		//System.out.println(printHello());//에러 발생

	}
	/* 기능 : 두 정수가 주어지면 두정수의 합을 구하는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 두 정수의 합 => int
	 * 메소드명 : sum
	 */
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	/* 두 정수의 최대 공약수를 구하여 알려주는 메소드를 만들고, main에서 테스트하세요.
	 * 매개변수 : 두 정수=> int num1, int num2
	 * 리턴타입 : 두 정수의 최대 공약수 => int
	 * 메소드명 : gcd
	 */
	public static int gcd(int num1, int num2) {
		//int num1 = 7, num2 = 12;
		int i;
		int res=1;
		for(i=1; i<=num1 ;i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				res = i;
			}
		}
		return res;
	}
	/* 기능 : 정수들의 합을 구하는 메소드
	 * 매개변수 : 정수들=> int ... num
	 * 리턴타입 : 정수들의 합=> int
	 * 메소드명 : sum2
	 */
	//매개변수의 갯수를 모르는 경우1
	public static int sum2(int ... num) {
		int sum = 0;
		for(int tmp : num) {
			sum += tmp;
		}
		return sum;
	}
	//매개변수의 갯수를 모르는 경우2
	public static int sum3(int[] num) {
		int sum = 0;
		for(int tmp : num) {
			sum += tmp;
		}
		return sum;
	}
	/* 기능 : Hello를 콘솔에 출력하는 메소드
	 * 매개변수 : 없음  
	 * 리턴타입 : 없음 => void
	 * 메소드명 : printHello
	 */
	public static void printHello() {
		System.out.println("Hello");
		/* 리턴타입이 void인 메소드에서 return을 이용하는 이유는
		 * 상황에 따라 메소드를 강제 종료하고싶을 때 사용한다.
		 */
		return ;
	}
	public void printHello2() {
		System.out.println("Hello");
		return ;
	}
}







