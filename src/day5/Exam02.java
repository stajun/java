package day5;

public class Exam02 {

	public static void main(String[] args) {
		/* score1 : 배열
		 * score2 : 배열
		 * score3 : 배열
		 * score4 : 정수형 변수
		 * null값을 이용하여 초기화 가능한 변수는 참조 변수뿐이다.
		 */
		int []score1 = null, score3 = null;
		int score2[] = null, score4;
		int score5[] = {100,90,80,70};
		int score6[] = new int[] {100,90,80,70};
		int score7[] = new int[5];
		/* 배열을 사용하려면 배열의 번지(인덱스)를 이용하여 접근해야한다.
		 * 모든 배열의 시작 번지는 0, 마지막번지는 배열의 크기-1번지까지
		 */
		score7[0] = 10;
		score7[1] = 20;
		score7[2] = 30;
		score7[3] = 40;
		score7[4] = 50;
		int i;
		for(i=0; i<score7.length; i++) {
			score7[i] = (i+1)*10;
		}
		for(i=0; i<score7.length; i++) {
			System.out.println(score7[i]);
		}
		int score8[];
		//{}를 이용한 초기화는 배열 선언시에만 사용 가능하다
		//score8 = {10,20,30,40};//에러 발생
		score8 = new int [5];
		int score9[] = score8;
		//하나의 배열을 참조변수 score8과 score9가 같이 사용한다.
		System.out.println("score8[0] : "+score8[0]);
		System.out.println("score9[0] : "+score9[0]);
		score8[0] = 10;
		System.out.println("score8[0] : "+score8[0]);
		System.out.println("score9[0] : "+score9[0]);
		int num1 = 10;
		int num2 = num1;
		score8 = new int [10];
		score8[0] = 100;
		System.out.println("score8[0] : "+score8[0]);
		System.out.println("score9[0] : "+score9[0]);
		System.out.println("score8의 길이 : "+score8.length);
		System.out.println("score9의 길이 : "+score9.length);
	}

}
