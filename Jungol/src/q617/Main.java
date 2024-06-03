package q617;

import java.util.Scanner;

class Person {
	private String name;
	private int height;

	public Person(String A, int B) {
		this.name = A;
		this.height = B;
	}

	public int getHeight() {
		return height;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person I[] = new Person[5];
		for (int i = 0; i < 5; i++) {
			I[i] = new Person(sc.next(), sc.nextInt());
		}
		for (int i = 0; i < I.length; i++) {
			System.out.println(I[i].getName());
		}
	}

}
