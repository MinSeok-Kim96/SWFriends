package Controls;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("두수의 합이 2와 3의 동시배수만 출력");
		int i1 = sc1.nextInt();
		int i2 = sc1.nextInt();
		int i3 = (i1+i2);
		if(i3%2==0 && i3%3==0) {
			System.out.println(i3);
		}

	}

}
