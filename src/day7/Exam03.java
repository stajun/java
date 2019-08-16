package day7;

public class Exam03 {
	//과제 : 로또 예제
	public static void main(String[] args) {
		int lotto[] = new int [6];
		int cnt = 0;//현재 랜덤으로 만들어진 번호의 갯수
		while(cnt < lotto.length) {
			int r = random(1,45);
			if(!duplicate(lotto, cnt, r)) {
				lotto[cnt++] = r;
			}
		}
		Exam02.printArr(lotto);
	}
	/* 기능 : min~max사이의 랜덤한 정수를 생성하여 알려주는 메소드
	 * 매개변수 : min~max => int min, int max
	 * 리턴타입 : 랜덤한 수=>int
	 * 메소드명 : random 
	 */
	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max - min +1)) + min;
	}
	/* 기능 : 정수배열 arr에 cnt개 중에서 정수 num가 있는지 없는지 알려주는 메소드 
	 * 매개변수 : 정수배열,갯수,비교정수=>int arr[], int cnt, int num
	 * 리턴타입 : 있는지 없는지=>boolean
	 * 메소드명 : duplicate
	 */
	public static boolean duplicate(int arr[], int cnt, int num) {
		if(cnt > arr.length) {
			cnt = arr.length;
		}
		for(int i=0; i<cnt; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
}
