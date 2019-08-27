package day9;

public class Car extends Vehicle {
	//멤버변수
	private int maxBoardCount;
	private int nowBoardCount;
	private Tire t;
	//getter와 setter
	public int getMaxBoardCount() {
		return maxBoardCount;
	}
	public void setMaxBoardCount(int maxBoardCount) {
		this.maxBoardCount = maxBoardCount;
	}
	public int getNowBoardCount() {
		return nowBoardCount;
	}
	//setNowBoardCount()를 뺀 이유는 현재 탑승 인원은 탑승 메소드와 하차 메소드를
	//이용하여 결정되어야 한다.
	//탑승 메소드
	public void onBoard(int count) {
		if(maxBoardCount < count + nowBoardCount) {
			System.out.println("정원을 초과하여 탑승할 수 없습니다.");
		}else {
			nowBoardCount += count;
			System.out.println(count+"명이 차량에 탑승했습니다.");
		}
	}
	public void offBoard(int count) {
		if(0 > nowBoardCount - count) {
			System.out.println("하차하려는 인원이 잘못되었습니다.");
		}else {
			nowBoardCount -= count;
			System.out.println(count+"명이 차량에 하차했습니다.");
		}
	}
	//생성자
	public Car() {}
	public Car(int tire, int maxBoardCount) {
		super(tire);
		this.maxBoardCount = maxBoardCount;
	}
	public Car(int tire, int maxBoardCount, Tire t) {
		super(tire);
		this.maxBoardCount = maxBoardCount;
		//t객체가 자식클래스의 객체가 넘어올 수 있으며,
		//이런 경우 필드의 다형성 예제가 된다.
		this.t = t;
	}
}






