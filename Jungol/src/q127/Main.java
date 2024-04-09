package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int count = 0;
		int sum = 0;

		while (true) {
			a = sc.nextInt();
			sum += a;
			count++;
			if (a > 100) {
				System.out.println("sum : " + (sum - a));
				System.out.printf("avg : %.1f",(double) ((sum - a) / (count - 1)));

				break;
			}
		}

	}
}
