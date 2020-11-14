package Controls;

import java.util.Scanner;

public class Q04 {

public static void main(String[] args) {
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("숫자 세개중 큰수 나열");
	int i1 = sc1.nextInt();
	int i2 = sc1.nextInt();
	int i3 = sc1.nextInt();
	if(i1>i3 && i1>i2 && i2>i3) {
		System.out.println(i1 + "," + i2 + "," + i3);
	}	else if(i1>i3 && i1>i2 && i3>i2){
			System.out.println(i1 + "," + i3 + "," + i2);
		}	
		else if(i2>i1 && i2>i3 && i1>i3) {
			System.out.println(i2 + "," + i1 + "," + i3);
		}
		else if(i2>i1 && i2>i3 && i3>i1) {
			System.out.println(i2 + "," + i3 + "," + i1);
		}
		else if(i3>i1 && i3>i2 && i1>i2) {
			System.out.println(i3 + "," + i1 + "," + i2);
		}
		else if(i3>i1 && i3>i2 && i2>i1) {
			System.out.println(i3 + "," + i2 + "," + i1);
			
		}
			
	
	
	}

}
