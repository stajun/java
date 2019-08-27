package day10;

import java.util.Scanner;

public class Exam01 {

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
				switch (op) {
				case '+':	res = num1 + num2;	break;
				case '-':	res = num1 - num2;	break;
				case '*':	res = num1 * num2;	break;
				case '/':	res = (double)num1 / num2;	break;
				case '%':	res = num1 % num2;	break;
				default:
					System.out.println(op+"는 잘못된 연산자입니다.");
					return;
				}
				System.out.println("" + num1 + op + num2 +"="+res);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			catch(RuntimeException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			//catch(Exception e)는 무조건 catch문 마지막에
			catch(Exception e) {
				System.out.println("예외가 발생했습니다.");
			}finally {
				System.out.println("무조건 실행되는 코드입니다.");
			}
		}
	}
}
