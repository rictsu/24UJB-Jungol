package q595;

public class Main {

	public static void main(String[] args) {
		String A = "Hong Gil Dong";
		for(int i = 3; i<=6;i++) {
			System.out.print(A.charAt(i));
		}
		System.out.printf("\n%s\n","--------------------------");
		
		System.out.println(A.substring(3,7));
}
}