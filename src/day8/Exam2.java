package day8;

public class Exam2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math2 m = new Math2();
		System.out.println(m.PI);
		//m.PI = 3;
		System.out.println(m.PI);
		System.out.println(Math.PI);
	}

}

class Math2{
	public final double PI = 3.14;
	public final static double PI2 = 3.14;//상수 => 모든 객체가 공유
	
}
