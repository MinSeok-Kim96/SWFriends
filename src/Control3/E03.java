package Control3;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {

		//������
		Scanner in = new Scanner(System.in);
		System.out.println("구구단을 입력하세요");
		int soo = in.nextInt();
		System.out.println("몇단까지?");
		int end = in.nextInt();
		for(int i=1;i<=end;i++) {
			System.out.println(soo+"*"+i+"="+soo*i);
		}
	}

}
