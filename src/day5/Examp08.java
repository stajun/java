package day5;

public class Examp08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = sum(1,2);
		//int res = 3;
		System.out.println(res);
		printHello();

	}
	/* 기능 : 두 정수가 주어지면(알려주면) 두 정수의 합을 알려주는 메소드
	 * 매개변수 : 두 정수=>int num1, int num2
	 * 리턴타입 : 두 정수의 합=>정수=>int
	 * 함수이름 : sum
	 */
	public static int sum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
	/* 기능 : Hello를 콘솔에 출력하는 메소드
	 * 매개변수 : 없음 => void
	 * 리턴타입 : 없음 => 생략
	 * 함수이름 : printHello
	 */
	public static void printHello() {
		System.out.println("Hello");
	}
}





