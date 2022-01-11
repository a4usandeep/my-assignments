import java.util.Scanner;

public class Fibonacci {
	public static void main(String[]abc) {
		
		int n = 13, firstTerm=0, secondTerm=1;
		System.out.println("fibonacci series till " + n + " terms:");
		for(int i=1; i<=n; i++) {
			System.out.println(firstTerm+" ");
			int nextTerm=firstTerm + secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
	}
}
