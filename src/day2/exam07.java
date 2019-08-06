package day2;

public class exam07 {

	public static void main(String[] args) {
						
		// TODO Auto-generated method stub
		int num = 2;
		// 정수형 변수 num가 홀수이면 홀수라고 출력하고
		// 짝수이면 짝수라고 출력하는 코드를 작성하세요.
		
		//num가 짝수이면 ==> num가 2의 배수이면
		if(num % 2 == 1 ) {
			System.out.println("홀수");
		}else{
			System.out.println("짝수");
		}
		
		//2의 배수이면 2의 배수라고 출력하고
		//3의 배수이면 3의 배수라고 출력하고
		//6의 배수이면 6의 배수라고 출력하고
		//2,3,6의 배수가 아니면 2,3,6의 배수가 아닙니다라고 출력하는 코드를 작성하세요.
		//2, 3, 6, 4, 9, 5
		num = 6;
		if(num % 6 == 0) {
			System.out.println("6의 배수");
		}else if(num % 3 == 0) {
			System.out.println("3의 배수");
		}else if(num % 2 == 0) {
			System.out.println("2의 배수");
		}else{
			System.out.println("2,3,6의 배수가 아님");
		}
		
		System.out.println("=============");
		if(num % 2 == 0 && num % 3 != 0) {
			System.out.println("2의 배수");
		}else if(num % 3 == 0 && num % 2 != 0) {
			System.out.println("3의 배수");
		}else if(num % 6 == 0) {
			System.out.println("6의 배수");
		}else{
			System.out.println("2,3,6의 배수가 아님");
		}
		
		if(num % 2 == 0)//; 
		{
			System.out.println("짝수");
		}//; //;에 의해 에러 발생
		else//(num % 2 != 0) //else에는 조건식이 올 수 없다 
		{
			System.out.println("홀수");
		}
		
	}

}
