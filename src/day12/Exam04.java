package day12;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread6 t = new Thread6();
		t.start();
		int num = 0;
		Scanner scan = new Scanner(System.in);
		while(num >= 0 ) {
			System.out.print("양의 정수를 입력하세요(종료하려면 음수입력) : ");
			num = scan.nextInt();
		}
		t.setStop(true);
		scan.close();
		System.out.println("메인 종료");
	}

}

class Thread6 extends Thread{
	private boolean stop = false;
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	@Override
	public void run() {
		long count = 0;
		while(!stop) {
			count++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(count+"ms");
	}
}