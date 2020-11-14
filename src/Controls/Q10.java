package Controls;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("갯수입력");
		int dorder = in.nextInt();
		int prise = 5000;
		int end = dorder*prise;
		double end2 = end*0.9;
		double end3 = end*0.88;
		if(dorder<10)
			System.out.println(end);
		else if(dorder>=100) {
			System.out.println(end3);
		}
		else if(dorder>=10) {
			System.out.println(end2);
		}

		
	}

}
