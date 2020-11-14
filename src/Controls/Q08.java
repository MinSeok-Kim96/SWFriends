package Controls;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("말타기");
		int ride = in.nextInt();
		int rtime = ride-30;
		int rtime2 = rtime/10;
		int basic = 3000;
		int basic2 = 3500;
		int add = 500;
		if(ride>=40)
			System.out.println(basic2 + rtime2*add);
		else if (ride>30) {
			System.out.println(basic2);
		}
		else if(ride<=30){
			System.out.println(basic);
		}
		

	}

}
