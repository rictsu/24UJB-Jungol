package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char inp = '\0';
		for (;;) {
			inp = sc.next().charAt(0);
			if (Character.isAlphabetic(inp)) {
				System.out.println(inp);
			} else if (Character.isDigit(inp)) {
				System.out.println((int) inp);
			} else {
				break;
			}

			// 1.c style
//			if (('a' <= inp && inp <= 'z') || ('A' <= inp && inp <= 'Z')) {
//				System.out.println(inp);
//			} else if ('0' <= inp && inp <= '9') {
//				System.out.println((int) inp);
//			} else {
//				break;
//			}
//
//		}
		}

	}

}