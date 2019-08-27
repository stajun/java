package day9;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tire t = new NexenTire();
		//3번째 매개변수로 Tire클래스의 객체가 필요한데
		//c1에는 Tire클래스의 자식클래스 NexenTire의 객체를
		//c2에는 Tire클래스의 자식클래스 KoreaTire의 객체를
		//넘겨주는 예제로 매개변수의 다형성을 나타나는 예제이다.
		Car c1 = new Car(4,4, new NexenTire());
		Car c2 = new Car(4,6, new KoreaTire());
	}

}
