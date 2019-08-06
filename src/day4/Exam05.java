package day4;

public class Exam05 {

	public static void main(String[] args) {
		// 2~9단을 출력하는 코드를 작성하세요.
		int num = 3;
		int i;
		for(num=2; num<=9; num++) {
			for(i=1; i<=9; i++) {
				System.out.println("" + num + "X" + i + " = " + num*i);
			}
		}
	}
}
