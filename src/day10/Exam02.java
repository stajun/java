package day10;

public class Exam02 {

	public static void main(String[] args) {
		
		int [] arr = new int [5];
		//배열을 이용할 때 발생할 수 있는 예외
		try {
			for(int i = 0; i<= arr.length; i++) {
				System.out.println(arr[i]);
			}
		}catch(Exception e) {
			System.out.println("예외 발생");
		}
		//참조변수를 사용할 때 발생할 수 있는 예외로
		//참조 변수의 멤버 메소드나 멤버 변수를 사용할 때 참조변수가 null값이 아닌지
		//확인한 후 사용해야함
		arr = null;
		int size = 0;
		try {
			size = arr.length;
		}catch(Exception e) {
			System.out.println("예외 발생2");
		}
		System.out.println(size);
		int size2 = 0;
		if(arr != null) {
			size2 = arr.length;
		}
		//없는 클래스를 이용하려 할 때 예외 발생
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
