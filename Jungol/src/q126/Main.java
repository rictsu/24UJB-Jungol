package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int odd = 0;
		int even = 0;
		while (true) {
			a = sc.nextInt();
			if (a % 2 != 0) {
				odd++;
			} else if (a != 0 && a % 2 == 0) {
				even++;
			}

			if (a == 0) {
				sc.close();
				System.out.println("odd : " + odd);
				System.out.println("even : " + (even));
				break;
			}

		}

	}
}
