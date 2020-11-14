package Control3;

import java.util.Scanner;

public class E05 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하시오");
		Scanner in = new Scanner(System.in);
		int num = 0;
		int [] bae = new int[10];
		int soo1 = in.nextInt();
		for(int i=0;i<10;i++) {
			bae[i]=num++;
		}
		for(int i=0;i<soo1;i++) {
			System.out.print(bae[i]);
		}
	}

}

