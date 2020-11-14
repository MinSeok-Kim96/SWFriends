package Controls;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("학점");
		int point1 = in.nextInt();
		int point2 = in.nextInt();
		int point3 = in.nextInt();
		int last = point1+point2+point3;
		double average = last/3;
		if(average>=90)
			System.out.println("A");
		else if(average>=80) {
			System.out.println("B");
		}
		else if(average>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
	}

}
