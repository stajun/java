package day11;

public class Exam05 {

	public static void main(String[] args) {
		String str ="자바는 프로그래밍언어입니다.";
		str = str.replace("자바", "Java");
		System.out.println(str);
		str = "cat.jpg";
		//str 원본과 같은 문자열
		String str1 = str.substring(0);
		System.out.println(str1);
		String str2 = str.substring(3);
		System.out.println(str2);
		String str3 = str.substring(3,4);
		System.out.println(str3);
	}

}
