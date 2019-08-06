package day3;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 두 실수와 산술 연산자가 주어졌을 때 해당 연산결과를 출력하는 코드를
		// switch문으로 작성하세요.(+, -, *, /, %)
		Scanner scan = new Scanner(System.in);
		// 1 / 2
		double num1 = scan.nextDouble();
		char op = scan.next().charAt(0);
		double num2 = scan.nextDouble();
		double res = 0.0;
		
		switch(op) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / num2;
			break;
		case '%':
			res = num1 % num2;
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			return;
		}
		
		System.out.println(""+num1 + op + num2 + "=" + res);
	}

}
