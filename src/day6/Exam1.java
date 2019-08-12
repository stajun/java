package day6;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		/* 학생 3명의 점수를 정수로 입력받고 3명 학생의 총점과 평균을 구하는 
		 * 코드를 작성하고 콘솔에 출력하세요. 
		 */
		int score[] = new int[3];
		
		int sum = 0;
		double avg = 0.0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생의 점수를 입력하세요.");
		for(int i = 0; i<score.length; i++) {
			System.out.print((i+1)+"번 학생 성적 : ");
			score[i] = scan.nextInt();
			sum += score[i];
		}
		
		for(int i = 0; i<score.length; i++) {
			System.out.println((i+1)+"번 학생 성적 : " + score[i]);
		}
		System.out.println("학생들의 총점 : " + sum);
		
		avg = (double)sum/score.length;
		System.out.println("학생들의 평균 : " + avg);
	}

}
