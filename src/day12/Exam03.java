package day12;

public class Exam03 {

	public static void main(String[] args) {
		Thread t3 = new Thread3();
		Thread main = Thread.currentThread();
		
		t3.setPriority(10);
		main.setPriority(1);
		t3.start();
		
		for(int i=0; i<100; i++) {
			System.out.print("-");
		}
	}

}

class Thread3 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.print("|");
		}
	}
}