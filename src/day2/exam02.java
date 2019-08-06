package day2;

public class exam02 {

	//증감연산자의 전위형과 후위형 구별 예제
	public static void main(String[] args) {
		int num = 10;
		System.out.println("전위형 전 : " + num);
		System.out.println("전위형 중 : " + ++num);
		System.out.println("전위형 후 : " + num);
		
		num = 10;
		System.out.println("후위형 전 : " + num);
		System.out.println("후위형 중 : " + num++);
		System.out.println("후위형 후 : " + num);
		
		System.out.println("----------------");
		
		num = 10;
		System.out.println("전위형 전 : " + num);
		num++;
		System.out.println("전위형 중 : " + num);
		System.out.println("전위형 후 : " + num);
		
		num = 10;
		System.out.println("후위형 전 : " + num);
		System.out.println("후위형 중 : " + num);
		num++;
		System.out.println("후위형 후 : " + num);
	}

}
