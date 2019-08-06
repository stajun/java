package day3;

public class Exam02 {

	public static void main(String[] args) {
		//정수 num이 홀수인지 짝수인지 판별하는 코드를 switch문으로 작성하세요.
		//식의 값이 제한적일 때
		int num = 11;
		switch(num % 2) {
		case 0:
			System.out.println("짝수");
			break;
		default://case 1:
			System.out.println("홀수");
			break;
		}

	}

}
