package day11;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		String str = "Hello world";
		System.out.println(str);
		char []arr = new char[11];
		str += "!";
		System.out.println(str);
		//arr = "Hi";//에러 발생
		arr[0] = 'H';
		arr[1] = 'i';
		arr[2] = '\0';
		str = "Hi";
		System.out.println(str);
		Scanner scan = new Scanner(System.in);
		//char ch = scan.next().charAt(0);
		System.out.println(str.charAt(0));
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		if(str1 == str2) {
			System.out.println("두 문자열은 같습니다.1");
		}
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 같습니다.2");
		}
		str1 = "123.456.789";
		//str1에서 .이 처음 나타난 번지를 index변수에 저장
		int index = str1.indexOf(".");
		System.out.println(index);
		index = str1.indexOf(".",index+1);
		System.out.println(index);
		index = str1.indexOf(".",index+1);
		System.out.println(index);
		
		
		str1 = "123.456.789...........";
		int count = 0;
		index = str1.indexOf(".");
		while(index != -1) {
			count++;
			index = str1.indexOf(".",index+1);
		}
		System.out.println(".의 갯수 : " + count);
	}

}
