package day9;

public class Exam05 {

	public static void main(String[] args) {
		// 인터페이스는 인터페이스 자체로 객체를 생성할 수 없다.
		//RemoteController r = new RemoteController();
		// 하지만 인터페이스를 구현한 클래스의 객체를 이용하여 생성할 수 있따.
		RemoteController r = new TvRemoteController();
		r.turnOn();
		r.turnOff();
		Vehicle v = new Car();
		Vehicle [] arr = new Vehicle [20];
		arr[0] = new Car();
		arr[1] = new Bicycle();
	}

}
class Bicycle extends Car{
	
}

