package day10;

public class Exam05 {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		if(p1 == p2) {
			System.out.println("두 객체는 동일한 객체입니다.");
		}else {
			System.out.println("두 객체는 다른 객체입니다.");
		}
		
		if(p1.equals(p2)) {
			System.out.println("두 객체는 동일한 객체입니다.");
		}else {
			System.out.println("두 객체는 다른 객체입니다.");
		}
		System.out.println(p1);
	}

}

class Point{
	int x;
	int y;
	//객체를 분류하는 코드로 비교할 때 빠르게 비교하기 위한 방법이다.
	//10,0 => 41 * 31
	//0,10 => 31 * *(31+10)
	//5,5 => 36 * 31 + 5
	@Override
	public int hashCode() {
		//소수중에서 2의 제곱수와 가장 가까운 수
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	//매우 중요 => 컬렉션 프레임워크를 제대로 사용하려면 equals를 재정의하는 연습이 필요
	@Override
	public boolean equals(Object obj) {
		//동일 객체인 경우 같은 객체로 처리
		if (this == obj)
			return true;
		//매개변수가 null인 경우=>비교할 멤버변수가 없는 경우
		if (obj == null)
			return false;
		//비교대상 클래스가 다른 경우
		if (getClass() != obj.getClass())
			return false;
		//실제 멤버 변수의 값을 비교
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