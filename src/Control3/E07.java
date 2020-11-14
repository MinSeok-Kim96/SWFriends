package Control3;

import java.util.Scanner;

public class E07 {

	public static void main(String[] args) {

		int [] st = new int[4];
		Scanner in = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		int kook = in.nextInt();
		int sooh = in.nextInt();
		int eng = in.nextInt();
		int count = 0;
		while (count!=4) {
		if (kook > 100 || sooh > 100 || eng > 100) {
			continue;
		}
		if (count==3) {
			break;
		}
		count++;
		st[0]= kook;
		st[1]= sooh;
		st[2]= eng;
		st[3]= st[0]+st[1]+st[2];
		}
		int avg = st[3]/count;
		System.out.print("국어 : "+st[0]+" 수학 : "+st[1]+" 영어 : "+st[2]+" 총점 : "+st[3]+" 평균 : "+avg);

	}

}
