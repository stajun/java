package day9;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(4,4);
		c1.onBoard(3);
		c1.onBoard(2);
		c1.offBoard(3);
		c1.turnOn();
		c1.turnOff();
		//자식 클래스는 부모 클래스를 포함한 클래스, 다른 표현으로 부모보다 크기 때문에
		//자식 클래스의 객체를 생성한 후 부모 클래스의 객체로 넘겨줄 수 있다.
		Vehicle v1 = c1;
		//크기가 작은 부모클랫의 객체를 만들어서 크기가 큰 자식 객체한테 쓰라고 주면
		//자식 객체는 부족한 부분이 생기기 때문에 안된다.
		//Car c2 = new Vehicle();//에러 발생
		Car c3 = (Car)v1;
		
	}
}
