package Controls;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("2의 배수이면서 큰수 출력");
		int i1 = sc1.nextInt();
		int i2 = sc1.nextInt();
		if(i1>i2 && i1%2==0) {
			System.out.println(i1);
		}
		else if(i2>i1 && i2%2==0) {
			System.out.println(i2);
		}

	}

}
