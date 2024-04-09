package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 0;
		int i = 0;
		while (true) {
			int a = sc.nextInt();
			b += a;
			i++;
			if (a >= 100) {
				System.out.println(b);
				System.out.printf("%.1f", (double) b / i);
				sc.close();
				break;
			}
		}

	}
}
