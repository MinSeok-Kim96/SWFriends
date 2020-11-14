package Controls;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("갯수입력");
		int order = in.nextInt();
		int odnum1 = 2500;
		int odnum2 = 2400;
		int prise1 = odnum1*order;
		int prise2 = odnum2*order;
		if(order<10)
			System.out.println(prise1);
		else {
			System.out.println(prise2);
		}
		
	}

}
