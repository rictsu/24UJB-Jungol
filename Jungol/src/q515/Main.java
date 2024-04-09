package q515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int result = a*b;
		int result1 = a/b;
		System.out.println(a +" * "+b+" = "+result );
		System.out.println(a +" / "+b+" = "+result1 );
	}

}
