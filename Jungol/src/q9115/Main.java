package q9115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		for(int i = 0 ; i<A.length();i++) {
			System.out.print(A.charAt(i));
		}
	}

}