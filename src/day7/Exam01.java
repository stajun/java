package day7;

public class Exam01 {
	//생성자와 생성자 오버로딩 예제 및 참조변수 예제
	public static void main(String[] args) {
		/* 모든 객체는 new 연산자와 생성자를 통해 만든다.
		 * 객체 선언은 
		 * 클래스명 객체명;
		 * 으로 한다.
		 */
		Point p = new Point();
		p.print();
		p.x = 10;
		p.print();
		p.move(1, 1);
		p.print();
		//생성자 오버로딩을 이용하여 p1 객체 생성
		Point p1 = new Point(5,5);
		p1.print();
		//복사 생성자를 이용하여 p1을 복사한 객체 p2를 생성
		Point p2 = new Point(p1);
		p2.print();
		p1.x = 20;
		p2.print();
		//p2의 주소값을 p3에 저장하기 때문에 하나의 객체를
		//p2와 p3가 같이 공유하고 있다
		//따라서 아래 코드에서 p2가 멤버변수의 값을 수정하면 p3도 받는다.
		Point p3 = p2;
		p3.print();
		p2.x = 20;
		p3.print();
	}
}

//2차원 좌표 평면의 점을 나타내는 클래스
//default 접근제한자 Point 클래스로 day7 패키지에서만 사용 가능
class Point{
	public int x;
	public int y;
	//기본 생성자
	public Point() {
		x = 0;
		y = 0;
	}
	//생성자 오버로딩
	public Point(int _x, int _y){
		x = _x;
		y = _y;
	}
	//복사 생성자
	public Point(Point p){
		x = p.x;
		y = p.y;
	}
	
	//아래 주석처리된 Point()는 생성자가 아닌 Point() 멤버 메소드이다.
	//public void Point() {}
	//초기화 블럭
	{
		this.x = 10;
		this.y = 10;
	}
	/* 멤버 변수가 초기화 되는 과정
	 * 1. 멤버변수 선언과 동시에 초기화(명시적 초기화)
	 * 2. 초기화 블럭에서 멤버변수 초기화
	 * 3. 생성자에서 멤버 변수 초기화
	 */
	/* 기능 : 멤버 변수 x,y의 좌표를 외부에서 알려준 _x, _y의 좌표로 이동시키는 메소드
	 * 매개변수 : 이동해야할 좌표 _x, _y => int _x, int _y
	 * 리턴타입 : 없음 => void
	 * 메소드명 : move
	 */
	public void move(int _x, int _y) {
		x = _x;
		y = _y;
	}
	/* 기능 : 현재 좌표를 콘솔에 출력하는 메소드
	 * 매개변수 : 없음 
	 * 리턴타입 : 없음 => void
	 * 메소드명 : print
	 */
	public void print() {
		System.out.println("("+x+","+y+")");
	}
}




