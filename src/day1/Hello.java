package day1;

public class Hello {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0b10;
		int num3 = 010;
		int num4 = 0x10;
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println("num3 = "+num3);
		System.out.println("num4 = "+num4);
		char ch1 = 'A';
		char ch2 = 65;
		char ch3 = '\u0041';//41 => 16*4 + 1 * 1 = 65
		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + ch2);
		System.out.println("ch3 = " + ch3);
		// =을 기준으로 왼쪽과 오른쪽이 모두 정수형일 때
		// 왼쪽의 메모리 크기가 크면 자동 자료형(타입) 변환이 된다.
		int n = 'A';
		
		// =을 기준으로 왼쪽이 실수이고 오른쪽이 정수일 때
		// 자동 자료형 변환이 된다.
		double d = 1;
		d = 1.23;
		//Type mismatch: cannot convert from 
		//A to B
		int n1 = (int)d;
	}

}
