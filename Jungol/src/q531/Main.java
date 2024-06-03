package q531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		sc.close();
		if (a <= 50.80) {
			System.out.println("Flyweight");
		} else {
			if (a <= 61.23) {
				System.out.println("Lightweight");
			} else {
				if (a <= 72.57) {
					System.out.println("Middleweight");
				} else {
					if (a <= 88.45) {
						System.out.println("Cruiserweight");
					} else {
						System.out.println("Heavyweight");
					}
				}
			}

		}
	}

}
