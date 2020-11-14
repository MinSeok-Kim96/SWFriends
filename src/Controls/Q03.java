package Controls;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("큰수 출력");
		int i1 = sc1.nextInt();
		int i2 = sc1.nextInt();
		if(i1>=i2) {
			System.out.println(i1);
		}	else {
				System.out.println(i2);
			}

	}

}
