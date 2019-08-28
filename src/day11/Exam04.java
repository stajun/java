package day11;

public class Exam04 {

	public static void main(String[] args) {
		String str = "123.456.789";
		int index = str.lastIndexOf(".");
		while(index != -1) {
			System.out.println(index);
			index = str.lastIndexOf(".", index-1);
		}
		/* 다음과 같이 파일명이 주어졌을 때 주어진 파일이 그림파일인지
		 * 판별하세요.
		 * 그림파일 : jpg, png, gif
		 */
		String str1 = "Hello.java";
		String str2 = "cat.bmp";
		String img[] = {"jpg","png", "gif","bmp"};
		boolean isImg = false;
		
		index = str2.lastIndexOf(".");
		//.을 기준으로 확장자 추출하는 코드
		String ex = str2.substring(index+1);
		for(String tmp : img) {
			if(tmp.equals(ex)) {
				isImg = true;
			}
		}
		
		if(isImg) {
			System.out.println(str2 +"는 그림파일입니다.");
		}else {
			System.out.println(str2 +"는 그림파일이 아닙니다.");
		}
	}

}
