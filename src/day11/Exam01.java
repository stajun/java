package day11;

public class Exam01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		try {
			//예외 상황이 발생할 수 있는 코드
			//int res = num1 % num2;
			int res = mod(num1,num2);
			System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("예외 상황이 발생했습니다.");
			e.printStackTrace();
		}
	}
	public static int mod(int num1, int num2) throws Exception{
		if(num2 == 0)
			throw new Exception("0으로 나눌 수 없습니다.");
		return num1 % num2;
	}
}








