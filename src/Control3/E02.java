package Control3;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("??");
		int score = 0;
		int count = 0;
		int sum = 0;
		int max = 0;
		int avg = 0;
		while (score != -1) {
			System.out.println("점수는?:");
			score = in.nextInt();
			if (score > 100) {
				continue;
			}
			if (score == -1) {
				break;
			}
			if (score > max) {
				max = score;
			}
			sum += score;	// sum=sum+score;
			count++;		// count=count+1;
		}
		avg = sum / count;
		System.out.println("총점 :" + max);
		System.out.println("과목 수 :" + count);
		System.out.println("평균 :" + avg);
	}
}
