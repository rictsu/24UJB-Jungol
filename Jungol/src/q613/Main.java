package q613;

import java.util.Scanner;

class Student {
	private String name;
	private String schoolName;
	private int grade;

	public Student(String name, String schoolName, int grade) {
		this.name = name;
		this.schoolName = schoolName;
		this.grade = grade;
	}

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("SchoolName : " + schoolName);
		System.out.println("Grade : " + grade);
	}

//	public String getSchoolName() {
//		return schoolName;
//	}
//
//	public void setSchoolName(String schoolName) {
//		this.schoolName = schoolName;
//	}
//
//	public int getGrade() {
//		return grade;
//	}
//
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}
//
//	public String getName() {
//		return name;
//	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String schoolName = sc.next();
		int grade = sc.nextInt();
		sc.close();
		Student st1 = new Student(name, schoolName, grade);
		st1.print();
	}

}
