package day5_1;

import day5.Point;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.x = 10;	//public 접근 제한자
		//p.dx = 10;	//디폴트 접근제한//에러 발생 : 다른 패키지이어서
		//p.px = 10;	//private 접근제한자//에러 발생 : 다른 클래스이어서
	}

}
