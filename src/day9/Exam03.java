package day9;

public class Exam03 {

	public static void main(String[] args) {
		Object obj = new Car(9,4);
		if(obj instanceof Car) {
			((Car) obj).onBoard(4);
		}
		Object obj2 = new Vehicle(4);
		if(obj2 instanceof Car) {
			((Car) obj2).onBoard(4);
		}else {
			System.out.println("형변환이 불가능하여 탑승할 수 없습니다.");
		}
	}

}
