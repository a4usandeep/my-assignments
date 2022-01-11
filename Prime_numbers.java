import java.util.Scanner;

public class Prime_numbers {
	public static void main(String[]abc) {
		int i=2, count=0;
		System.out.println("enter the number to check prime or not");
		Scanner scanner= new Scanner(System.in);
		int number=scanner.nextInt();
		while(i<=number/2) {
			if(number%i==0) {
				count++;
				break;
			
			}
			i++;
		}
		if(count==0) {
			System.out.println(number+ " is prime number");
		}
		else {
			System.out.println(number+ " is not prime number");

		}
	}
}
