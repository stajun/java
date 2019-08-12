package day6;

import day6_1.Exam4;

public class Exam3 {

	public static void main(String[] args) {
		Test t = new Test();
		t.num1 = 10;
		t.num2 = 20;
		//t.num3 = 30;
		//e라는 객체를 선언
		Exam4 e;
		//객체를 생성하여 생성된 객체의 주소를 e에 저장
		e = new Exam4();
		e.printHello();
		Exam4.printHello();
		e.printHello2();
		//Exam4.printHello2();//에러 발생
	}

}
