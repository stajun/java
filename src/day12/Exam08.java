package day12;

import java.util.HashSet;

public class Exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		while(set.size() < 6) {
			int min = 1;
			int max = 10;
			int r = (int)(Math.random()*(max-min+1)+min);
			set.add(r);
		}
		for(Integer tmp : set) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		while(set2.size() < 6) {
			int min = 1;
			int max = 10;
			int r = (int)(Math.random()*(max-min+1)+min);
			set2.add(r);
		}
		for(Integer tmp : set2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		int count = 0;
		for(Integer tmp : set) {
			if(set2.contains(tmp)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
