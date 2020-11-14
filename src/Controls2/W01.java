package Controls2;

public class W01 {

	public static void main(String[] args) {
		
		/*
		 * 56789
		 * 45678
		 * 34567
		 * 23456
		 * 12345
		 */
		
		for(int i=5;i>0;i--) {
			for(int j=0;j<5;j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
		System.out.println("-----------------");
		/*
		 * 12345
		 * 23456
		 * 34567
		 * 45678
		 * 56789
		 */
		
		for(int i=1;i<=5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}

	}

}
