package q9015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하시오. ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int result = a+b;
		int result2 = a*b;
		
		System.out.println(a+" + "+b +" = " +result);
		System.out.print(a+" * "+b+" = "+result2);
	
	
	
	}

}
