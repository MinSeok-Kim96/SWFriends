package Controls;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("2의 배수면 출력");
		int i1 = sc1.nextInt();
		if(i1%2==0) {
			System.out.println("맞다");
		}	else {
				System.out.println("아니다");
			}


	}

}
