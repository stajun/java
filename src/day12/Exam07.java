package day12;

import java.util.HashSet;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Num> set = new HashSet<>();
		set.add(new Num(5));
		set.add(new Num(5));
		for(Num tmp:set) {
			System.out.println(tmp.getNum());
		}
		
	}

}
