package day11;

public class Exam08 {

	public static void main(String[] args) {
		String str = "java,c++,c,파이썬";
		String arr[] = str.split(",");
		for(String tmp : arr) {
			System.out.println(tmp);
		}
	}
}
