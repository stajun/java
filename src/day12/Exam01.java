package day12;

public class Exam01 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread2();
		t1.start();
		t2.start();
		for(int i=0; i<100; i++) {
			System.out.println("a");
		}
	}

}
class Thread1 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("b");
		}
	}
	
}
class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("c");
		}
	}
}