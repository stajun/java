package day5;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int today1 = 0;//0 : 월요일, 1: 화요일, 2:수요일
		Week today2 = Week.MONDAY;
		System.out.println(today1);
		System.out.println(today2.ordinal());
	}
}
//값들이 제한적일 때 열거형을 만들어서 사용
enum Week{
	MONDAY, TUESDAY,WEDNEDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
