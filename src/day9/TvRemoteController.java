package day9;

public class TvRemoteController implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println("Tv를 켰습니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 껐습니다.");
	}
}

interface A{
	void print();
	void move();
}
interface B{
	void print();
	void resize();
}
class C implements A, B{

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}





