package day10;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		char op = '%';
		double res = 0.0;
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			num1 = scan.nextInt();
			op = scan.next().charAt(0);
			num2 = scan.nextInt();
			try {
				res = calc(num1,num2,op);
				System.out.println("" + num1 + op + num2 +"="+res);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			catch(RuntimeException e) {
				e.printStackTrace();
			}
			//catch(Exception e)는 무조건 catch문 마지막에
			catch(Exception e) {
				System.out.println("예외가 발생했습니다.");
			}finally {
				System.out.println("무조건 실행되는 코드입니다.");
			}
		}

	}
	//main메소드에 구현된 산술 연산 코드를 메소드로 바꾸시오.
	/* 기능 : 두 정수와 산술 연산자가 주어지면 해당 산술 연산 결과를 반환하는 메소드 
	 * 매개변수 : 두정수, 산술연산자 => int num1, int num2, char op
	 * 리턴타입 : 산술 연산 결과 => 실수 =>double
	 * 메소드명 : calc
	 */
	public static double calc(int num1, int num2, char op) 
	{
		double res = 0.0;
		switch (op) {
		case '+':	res = num1 + num2;	break;
		case '-':	res = num1 - num2;	break;
		case '*':	res = num1 * num2;	break;
		case '/':	res = (double)num1 / num2;	break;
		case '%':	res = num1 % num2;	break;
		default:
			RuntimeException e = new RuntimeException("연산자가 잘못되었습니다.");
			throw e;
			//throw new RuntimeException("연산자가 잘못되었습니다.");
		}
		return res;
	}
}




