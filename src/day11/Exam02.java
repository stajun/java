package day11;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(1,1);
		Point p2 = new Point(1,1);
		if(p1 == p2) {
			System.out.println("두 점은 같은 지점에 있습니다.");
		}else {
			System.out.println("두 점은 다른 지점에 있습니다.");
		}
		if(p1.equals(p2)) {
			System.out.println("두 점은 같은 지점에 있습니다.");
		}else {
			System.out.println("두 점은 다른 지점에 있습니다.");
		}
		System.out.println(p1);
	}
}
class Point{
	int x;
	int y;
	public Point() {}
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
