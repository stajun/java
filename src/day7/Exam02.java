package day7;

public class Exam02 {
	//메소드의 매개변수로 일반변수일 때와 참조변수일때의 차이를 보여주는 예제
	public static void main(String[] args) {
		int lotto[] = new int[6];
		int num = 5;
		test(num);
		System.out.println(num);
		printArr(lotto);
		test(lotto);
		printArr(lotto);
		
		int lotto2[] = new int[6];
		printArr(lotto2);
		lotto2 = test2(lotto2);
		printArr(lotto2);
	}
	//매개변수가 참조변수이어도 매개변수의 값이 바뀌지 않는 예제
	public static int[] test2(int arr[]) {
		arr = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = 1;
		}
		return arr;
	}
	//매개변수가 일반변수일 때 값이 바뀌지 않을 보여주는 예제
	public static void test(int num) {
		num = 10;
	}
	//매개변수가 참조변수일 때 값이 바뀌는지 안바뀌는지 보여주는 예제
	public static void test(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = 1;
		}
	}
	
	public static void printArr(int []arr) {
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
}
