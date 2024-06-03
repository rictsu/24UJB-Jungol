package q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 0;
		int h = 0;
		char c;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Base = ");
			b = sc.nextInt();
			System.out.print("Height = ");
			h = sc.nextInt();
			System.out.printf("%s%.1f\n", "Triangle width = ", (double) b * (double) h / 2);
			System.out.print("Continue? ");
			c = sc.next().charAt(0);
			if (c == 'y' || c == 'Y') { 
				continue;
			}else {
				break;
			}
		}

	}
}
