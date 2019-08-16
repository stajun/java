package day7;

public class Exam04 {
	/*
	정적(static, 클래스) 멤버 메소드 vs (객체)멤버 메소드
	클래스를 통해 호출		vs 객체를 통해 호출
	객체 멤버 변수를 사용 X	vs 모든 멤버 변수 사용 O
	객체 멤버 메소드를 사용 X	vs 모든 멤버 메소드 사용 O
	
	클래스 멤버 변수 	vs 객체 멤버 변수
	모든 객체가 공유	vs 각 객체마다 변수가 존재
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2 p = new Point2();
		//멤버 메소드 print()호출 : 객체 p를 통해 호출
		p.print();
		//정적 멤버 메소드 print() 호출 : 클래스를 통해 호출
		Point2.print(1, 1);
		//정적 멤버 메소드 print() 호출 : 객체를 통해서도 호출
		p.print(1, 2);
		Point2 p1 = new Point2();
		Point2 p2 = new Point2(1,1);
		p1.print();
		p2.print();
		p.print();
	}
}

class Point2{
	private int x;
	private int y;
	public static int count = 0;
	public Point2() {
		//단, this()생성자를 이용하여 다른 생성자를 호출하는 경우
		//첫번째줄에 넣어주어야 한다.
		this(0,0);
	}
	public Point2(int x, int y) {
		this.x = x; 
		this.y = y;
		count++;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void print() {
		System.out.println("현재까지 만들어진 점의 갯수 : " + count);
		System.out.println("("+x+","+y+")");
	}
	public static void print(int x, int y) {
		System.out.println("("+x+","+y+")");
	}
}
