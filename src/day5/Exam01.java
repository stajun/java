package day5;

public class Exam01 {

	public static void main(String[] args) {
		/*
		    *		i=1	공=3		*=1
		   ***		i=2	공=2		*=3
		  *****		i=3	공=1		*=5
		 *******	i=4	공=0		*=7
		 				공=num-i *=2*i-1
	    */
		int i, j;
		int num = 7;
		for(i=1; i<=num; i++) {
			for(j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			for(j=1; j<= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		****	i=1	공=0		*=4
		 ***	i=2	공=1		*=3
		  **	i=3	공=2		*=2
		   *	i=4	공=3		*=1
		   			공=i-1	*=num+1-i
	    */			
		for(i=1; i<=num; i++) {
			for(j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=num+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1; i<=num; i++) {
			for(j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(j=num-i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
