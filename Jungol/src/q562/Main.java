package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		int sum = 0;
		double sum2 = 0;
		double avg = 0;
		sc.close();
		for (int i = 0; i < inp.length; i++) {
			if (i % 2 != 0) {
				sum += inp[i];
			} else {
				sum2 += inp[i];
			}
			avg = sum2 / 5;
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);

	}

}
