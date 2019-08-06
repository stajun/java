package day4;

public class Exam07 {

	public static void main(String[] args) {
		/*
		 * 아래와 같이 출력되도록 코드를 작성하세요.
		 * num = 5인 경우
		 * *****	i=1, *의 갯수 : 5
		 * *****	i=2, *의 갯수 : 5
		 * *****	i=3, *의 갯수 : 5
		 * *****	i=4, *의 갯수 : 5
		 * *****	i=5, *의 갯수 : 5
		 * 				 *의 갯수 : num
		 */
		int i,j;
		int num = 5;
		//i는 행, j는 열
		for(i=1; i<=num; i++) {
			for(j=1; j<=num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * 아래와 같이 출력되도록 코드를 작성하세요.
		 * num = 5인 경우
		 * *		i=1, *의 갯수 : 1 
		 * **		i=2, *의 갯수 : 2
		 * ***		i=3, *의 갯수 : 3
		 * ****		i=4, *의 갯수 : 4
		 * *****	i=5, *의 갯수 : 5
		 * 				 *의 갯수 : i
		 */
		for(i=1; i<=num; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * 아래와 같이 출력되도록 코드를 작성하세요.
		 * num = 5인 경우
		 *     *	i=1, 공갯수 :4 	*의 갯수 : 1 
		 *    **	i=2, 공갯수 :3 	*의 갯수 : 2
		 *   ***	i=3, 공갯수 :2 	*의 갯수 : 3
		 *  ****	i=4, 공갯수 :1 	*의 갯수 : 4
		 * *****	i=5, 공갯수 :0 	*의 갯수 : 5
		 * 				  공갯수 :num-i	*의 갯수 : i
		 */
		for(i=1; i<=num; i++) {
			for(j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		    *
		   ***
		  *****
		 *******
		*********
		
		*****
		 ****
		  ***
		   **
		    *
		 */
	    

	}

}
