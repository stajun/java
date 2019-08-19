package day8;

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r = new Rect();
		r.print();
		r.resize(5, 5);
		r.print();
		r.move(5, 5);
		r.print();
		Circle c = new Circle(0,0,5);
		c.print();
	}

}
//1. 도형 클래스 생성
//2. 도형 클래스를 상속받아 사각형 클래스 생성
//3. 도형 클래스를 상속받아 원 클래스 생성
/* 클래스명 : Shape
 * 멤버 변수(요소,부품,특징) : 왼쪽위의 점, 오른쪽 아래의 점, 가로의 길이, 세로의 길이  
 * 멤버 메소드(기능) : 왼쪽위의 점을 설정, 오른쪽 아래의 점을 설정하는 기능
 * 				  위치이동 기능, 크기 재조정, 가로의 길이 알려주는 기능, 
 *               세로의 길이 알려주는 기능
 */
abstract class Shape{
	//왼쪽 위의 점
	protected int left, up;
	//오른쪽 아래의 점
	protected int right, down;
	//가로 세로의 길이
	protected int width, height;
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
		calWidth();
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
		calHeight();
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
		calWidth();
	}
	public int getDown() {
		return down;
	}
	public void setDown(int down) {
		this.down = down;
		calHeight();
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	//위치이동 기능, 크기 재조정
	//왼쪽 위의 점을 x, y로 이동시킴
	public void move(int x, int y) {
		left = x;
		up = y;
		right = x + width;
		down = up - height;
	}
	//왼쪽 위의 점을 기준으로 크기를 재조정하는 기능
	public void resize(int w, int h) {
		right = left + w;
		down = up - h;
		width = w;
		height = h;
	}
	//가로의 길이를 계산하는 기능
	protected void calWidth() {
		width = right - left;
	}
	//세로의 길이를 계산하는 기능
	protected void calHeight() {
		height = up - down;
	}
	public Shape() {}
	public Shape(int left, int up, int right, int down) {
		this.left = left;
		this.up = up;
		this.right = right;
		this.down = down;
		calHeight();
		calWidth();
	}
	abstract void print();
}
//2. 도형 클래스를 상속받아 사각형 클래스 생성
class Rect extends Shape{
	@Override
	public void print() {
		System.out.println("사각형입니다.");
		System.out.println("좌상 점 : " + left +"," + up);
		System.out.println("우하 점 : " + right +"," + down);
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("넓이 : " + getArea());
	}
	public int getArea() {
		return width * height;
	}
}
//3. 도형 클래스를 상속받아 원 클래스 생성
class Circle extends Shape{
	final static double PI = 3.14;
	private double r;
	
	//오버 로드
	public void reszie(double r) {
		this.r = r;
	}
	@Override
	public void print() {
		System.out.println("원입니다.");
		System.out.println("중심점 : (" + (left+r) +"," + (up-r)+")");
		System.out.println("반지름 : " + r);
		System.out.println("넓이 : " + getArea());
	}
	public double getArea() {
		return PI*r*r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getCenterX() {
		return left + r;
	}
	public double getCenterY() {
		return up - r;
	}
	public Circle() {}
	public Circle(int left, int up, double r) {
		this.left = left;
		this.up = up;
		this.r = r;
	}
}








