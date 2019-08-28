package day11;

public class Exam06 {

	public static void main(String[] args) {
		Integer num = 0;
		num = 10;
		num = num + 20;
		num = null;
		//parseInt : 문자열을 정수로 만들어주는 메소드
		int tmp = Integer.parseInt("123");
		System.out.println(tmp);
		int num2 = 0;
		if(num != null) {
			num2 = num;
		}
		System.out.println(num2);
	}

}
