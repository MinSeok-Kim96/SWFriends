package Controls;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("3과 5의 동시배수만 출력");
		int i1 = sc1.nextInt();
		if(i1%3==0 && i1%5==0) {
			System.out.println(i1);
		}

	}

}
