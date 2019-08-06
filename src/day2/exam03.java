package day2;

public class exam03 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		double res = num1 / num2;
		//정수 / 정수 => 정수 라는걸 보여주는 예제
		System.out.println("" + num1 +"/"+num2 + "=" + res);
		res = num1 / (double)num2;
		System.out.println("" + num1 +"/"+num2 + "=" + res);
		num2 = 0;
		//정수/0을 해서 예외 발생
		//int num3 = num1 / num2;
		//System.out.println(num3);
		//정수 /0.0을 해서 예외가 발생하지 않고 무한대(Infinity)가 출력됨
		double num4 = num1 / (double)num2;
		System.out.println(num4);
		
		num1 = 5;
		num2 = 2;
		int num5 = num1 % num2;
		System.out.println("" + num1 +"%"+num2 + "=" + num5);
	}

}
