package Controls;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("3의 배수면 출력");
		int i1 = sc1.nextInt();
		if(i1%3==0) {
			System.out.println("3의 배수다");
		}

	}

}
