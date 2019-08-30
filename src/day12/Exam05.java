package day12;

import java.util.ArrayList;

public class Exam05 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);//0번지에 1을 추가
		list.add(2);//1번지에 2를 추가
		list.set(0, 3);//0번지에 있는 1를 3으로 수정
		list.remove(1);
		list.add(4);
		list.add(5);
		list.add(6);
		for(Integer tmp : list) {
			System.out.println(tmp);
		}
		
		System.out.println(list.contains(2));
		System.out.println(list.contains(6));
	}

}
