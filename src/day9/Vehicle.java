package day9;

public class Vehicle {
	//멤버변수
	protected int tire;
	protected double speed;
	//getter와 setter
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	//멤버 메소드
	public void turnOn() {
		System.out.println("시동이 켜졌습니다.");
	}
	public void turnOff() {
		System.out.println("시동이 꺼졌습니다.");
	}
	//생성자
	public Vehicle() {}
	public Vehicle(int tire) {
		this.tire = tire;
	}
}









