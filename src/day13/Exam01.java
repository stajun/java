package day13;

import java.util.ArrayList;
import java.util.Iterator;

public class Exam01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		for(Integer tmp : list) {
			System.out.println(tmp);
		}
		System.out.println("----------------");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer tmp = it.next();
			System.out.println(tmp);
		}
	}
}


