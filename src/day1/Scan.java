package day1;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		//Scanner라는 설계도를 이용하여 scanner이라는 이름을
		//가진 제품을 선언하고 new라는 연산자를 이용하여
		//제품을 생성
		//콘솔에서 입력받기 위해 System.in을 사용
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		double num2 = scanner.nextDouble();
		System.out.println(num1);
		System.out.println(num2);
		//next()라는 문자열을 읽어오는 메소드를 이용하여 문자열을
		//읽어온 후 charAt()메소드를 이용하여 0번지에 있는 값만
		//가져온다.
		char ch = scanner.next().charAt(0);
		System.out.println(ch);
		System.out.println(1 + '+' + 2);
		scanner.close();
	}

}
