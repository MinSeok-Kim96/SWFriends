package Controls2;

public class W03 {

	public static void main(String[] args) {

		/*		
		*****
		 ****
		  ***
		   **
		    *
		*/
		
		for(int i=0;i<5;i++) {
			for(int j=4;j>4-i;j--) {
				System.out.print(" ");
			}	for(int k=4;k>=i;k--) {
					System.out.print("*");
				}
			System.out.println();
		}

		System.out.println("-------------------");

		
		/*
		   *     
		   **    
		   ***   
		   ****  
		   ***** 
		 */
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>4-i;j--) {
				System.out.print("*");
			}	for(int k=4;k>=i;k--) {
					System.out.print(" ");
				}
			System.out.println();
		}
		
	}

}
