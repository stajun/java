package day8;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D();
		p.print();
		p.move(1, 1);
		p.print();
		String s;
	}

}
//2차원 : 부모클래스
class Point{
	protected int x;
	protected int y;
	public void move(int x, int y) {
		this.x = x;//멤버변수 x에 매개변수 x의 값을 저장
		this.y = y;
	}
	public void print() {
		System.out.println("("+x+","+y+")");
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
	public Point() {}
	public Point(Point p) {
		move(p.x,p.y);
	}
	
}
//3차원 => Point클래스를 상속받을 예정, 자식클래스
class Point3D extends Point{
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	//메소드 오버로딩: 부모클래스에 있는 void move(int x,int y)
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	//메소드 오버라이딩 : 부모클래스에 있는 메소드를 새로 정의하는 것
	@Override
	public void print() {
		System.out.println("("+x+","+y+","+z+")");
	}
	public Point3D() {}
	public Point3D(Point3D p) {
		//super();
		move(p.x,p.y,p.z);
	}
}






