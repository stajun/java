package day3;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		성적이 정수로 주어졌을 때 해당 성적에 대한 학점을 출력하는 코드를 작성하세요.
		A : 90~100 => 점수가 90점보다 (크거나 같)(고) 100점보다 (작거나 같으)(면) 
					  A라고 콘솔에 출력
		B : 80~89
		C : 70~79
		D : 60~69
		F : 0~59
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 정수로 입력하세요(0~100) : ");
		int score = scan.nextInt();
		
		if( score >= 90 && score <= 100 ) {
			System.out.println("A");
		}else if( score >= 80 && score < 90 ) {
			System.out.println("B");
		}else if( score >= 70 && score < 80 ) {
			System.out.println("C");
		}else if( score >= 60 && score < 70 ) {
			System.out.println("D");
		}else if( score >= 0 && score < 60 ) {
			System.out.println("F");
		}else {
			System.out.println("잘못된 성적입니다.");
		}
		scan.close();
	}

}
