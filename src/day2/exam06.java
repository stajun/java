package day2;

public class exam06 {

	public static void main(String[] args) {
		int num = 1;
		// 정수형 변수 num가 0이면 콘솔에 0입니다라고 출력하는 예제
		// 조건식 : num이 0이다=>num가 0과 같다
		//		  num == 0
		// 실행문 : 콘솔에 0입니다라고 출력
		if(num == 0) {
			System.out.println("0입니다.");
		}
		// 정수형 변수 num가 0이면 콘솔에 0입니다라고 출력하고,
		// 아니면 0이 아닙니라달고 출력하는 예제
		System.out.println("----------------");
		if(num == 0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("0이 아닙니다.");
		}
		
	}

}
