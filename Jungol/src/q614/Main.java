package q614;

import java.util.Scanner;

class Student {
	private String School;
	private int Grade;

	public Student(String A, int B) {
		this.School = A;
		this.Grade = B;
		System.out.println(B + " grade in " + A + " School");
	}

	public Student() {
		this.School = "Jejuelementary";
		this.Grade = 6;
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int B = sc.nextInt();
		sc.close();
		Student St1 = new Student("Jejuelementary", 6);
		Student St2 = new Student(A, B);
	}

}
