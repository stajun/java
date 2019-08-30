package day12;

public class Exam02 {

	public static void main(String[] args) {
		Thread4 t4 = new Thread4();
		Thread5 t5 = new Thread5();
		Account ac = new Account();
		ac.deposit(1000);
		t4.setAccount(ac);
		t5.setAccount(ac);
		t4.start();
		t5.start();
		//익명 클래스를 이용한 쓰레드 생성 방법
		/*
		 * Thread t6 = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub
		 * 
		 * } });
		 */
	}

}

class Thread4 extends Thread{
	Account ac;
	public void setAccount(Account ac) {
		this.ac = ac;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac.withdraw(1000);
	}
}
class Thread5 extends Thread{
	Account ac;
	public void setAccount(Account ac) {
		this.ac = ac;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac.withdraw(1000);
	}
}
class Account{
	int bal = 0;

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}
	public synchronized void withdraw(int money) {
	
		bal -= money;
		System.out.println("현재 잔액 : " + bal);
	}
	public synchronized void deposit(int money) {
		bal += money;
	}
}

