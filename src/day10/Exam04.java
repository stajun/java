package day10;

public class Exam04 {

	public static void main(String[] args) {
		
		try {
			//예외가 발생할 수 있는 코드
		}
		//catch는 자손부터 
		catch(ArithmeticException e) {
			
		}catch(RuntimeException e) {
			
		}
		//마지막엔 Exception e를 통해 처리
		catch(Exception e) {
			
		}finally {
			//예외에 상관없이 실행되어야 하는 코드
		}
	}
	public static void method() 
	throws Exception, ClassNotFoundException {
		/*
		if(예외가 발생할 수 있는 상황) {
			throw new Exception("메세지");
		}
		*/
	}
}




