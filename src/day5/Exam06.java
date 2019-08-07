package day5;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.x = 10;
		p.dx = 10;//에러 발생하지 않음 : 같은 패키지이서ㅓ
		//p.px = 10;//에러 발생 : 다른 클래스이어서
	}

}

