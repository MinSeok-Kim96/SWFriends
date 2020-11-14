package Controls2;

public class W04 {

	public static void main(String[] args) {

		/*
		    *   
		   ***  
		  *****
		 *******
		  *****
		   ***
		    *
		 */
		
		for(int i=0;i<7;i++) {
			if(i<3) {
				for(int k=3;k>i;k--) {
					System.out.print(" ");
				}
				for(int j=0; j<=2*i;j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for(int j=0;j<i-3;j++) {
					System.out.print(" ");
				}
				for(int k=10;k>=2*(i-1);k--) {
					System.out.print("*");
				}
				System.out.println();
			} 
		}

	}

}
