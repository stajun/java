package day5;

public class Exam03 {

	public static void main(String[] args) {
		//배열 복사 예제 및 향상된 for문 예제
		int arr1[] = {1,2,3,4,5};
		int arr2[] = new int [arr1.length];
		int i;
		for(i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.print("arr1 : ");
		for(i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] +" ");
		}
		System.out.println();
		
		System.out.print("arr2 : ");
		for(i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] +" ");
		}
		System.out.println();
		int arr3[] = {6,7,8,9,10};
		
		System.arraycopy(arr3, 0, arr2, 0, arr2.length);
		
		System.out.print("arr2 : ");
		//향상된 for문 : 배열이나 ArrayList와 같은 컬렉션 프레임워크에서 사용가능하다
		//사용할 때 : 전체 탐색을 하는 경우, 
		//        배열의 값을 바꾸지 않으면서 활용하는 경우  
		//        =>값을 비교하거나 확일할때 사용함, 배열값을 변경해야하는 경우에는
		//          사용을 잘 안함
		for(int tmp : arr2) {
			System.out.print(tmp +" ");
		}
		System.out.println();
	}

}
