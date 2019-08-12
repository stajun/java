package day6;

public class Exam2 {

	public static void main(String[] args) {
		/* min부터 max 사이의 랜덤한 정수를 만들어서 배열에 저장 후 출력하는
		 * 코드를 작성하세요.
		 */
		int min = 1;
		int max = 45;
		// min <= Math.random()*(max-min+1)+min < max+1
		int random = (int)(Math.random()*(max-min+1)+min);
		
		int lotto[] = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*(max-min+1)+min);
		}
		//lotto배열에서 하나씩 값을 꺼내 for문안에서 선언한 정수형 변수 tmp에 
		//저장
		for(int tmp : lotto) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}

}
