package minseokroom;

import java.util.Scanner;

public class hangman {

	public static void main(String[] args) {

		Scanner str1 = new Scanner(System.in);
		char [][] str2 = {{'_','_','_','_','_'},{'a','p','p','l','e'}};
		int num = 0;
		int count = 0;
		while(num!=13) {
			char str = str1.next().charAt(0);
			num++;
			for(int i=0; i<1; i++) {
				System.out.println(num+"번째 입력");
				for(int j=0; j<5; j++) {
					if(str=='a') {
						str2[0][0]=str2[1][0];
						System.out.print(str2[0][j]);
						continue;
					}
					else if(str=='p') {
						str2[0][1]=str2[1][1];
						str2[0][2]=str2[1][2];
						System.out.print(str2[0][j]);
						continue;
					}
					else if(str=='l') {
						str2[0][3]=str2[1][3];
						System.out.print(str2[0][j]);
						continue;
					}
					else if(str=='e') {
						str2[0][4]=str2[1][4];
						System.out.print(str2[0][j]);
						continue;
					}
					else {
						System.out.print(str2[0][j]);
						continue;
					}

				}
				
			}
			
		} System.out.println("");

	}

}
