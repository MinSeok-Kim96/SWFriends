package Controls2;

public class W07 {

	public static void main(String[] args) {

		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<1+2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<7-2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		

		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<9-2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<3+2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
