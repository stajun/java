package day5;

public class Exam04 {

	public static void main(String[] args) {
		//배열의 크기를 확장하는 과정 예제
		int arr1[] = {1,2,3,4,5};
		//1. 새로운 배열을 만듬(크기가 확장된)
		int arr2[] = new int[10];
		//2. 새로 만든 배열에 기존 배열 값을 복사
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		//3. 기존 배열을 새로 만든 배열로 교체
		arr1 = arr2;
		arr2 = null;
		

	}

}
