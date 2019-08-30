package day12;

import java.util.ArrayList;

public class Exam06 {

	public static void main(String[] args) {
		ArrayList<Num> list = new ArrayList<>();
		Num num = new Num(5);
		list.add(num);
		num.setNum(6);
		list.add(num);
		num.setNum(7);
		list.add(num);
		for(Num tmp : list) {
			System.out.println(tmp.getNum());
		}
		System.out.println("---------");
		ArrayList<Num> list2 = new ArrayList<>();
		Num num2 = new Num(5);
		list2.add(new Num(num2));
		num2.setNum(6);
		list2.add(new Num(num2));
		num2.setNum(7);
		list2.add(new Num(num2));
		for(Num tmp : list2) {
			System.out.println(tmp.getNum());
		}
	}

}
class Num{
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public Num(int num) {
		this.num = num;
	}
	public Num(Num n) {
		this.num = n.num;
	}

	@Override
	public int hashCode() {
		return num/10;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Num other = (Num) obj;
		if (num != other.num)
			return false;
		return true;
	}
}