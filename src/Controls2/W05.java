package Controls2;

public class W05 {

	public static void main(String[] args) {

		for(int i=0;i<9;i++) {
			if(i<5) {
				for(int k=4;k>i;k--) {
					System.out.print(" ");
				}
				for(int j=0; j<=2*i;j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for(int j=0;j<i-4;j++) {
					System.out.print(" ");
				}
				for(int k=14;k>=2*(i-1);k--) {
					System.out.print("*");
				}
				System.out.println();
			} 
		}
	}

}
