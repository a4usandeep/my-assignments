import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int number;
		System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        int i=1; int fact =1;
        while(i<=number) {
        	fact=fact*i;
        	i++;
        }
        System.out.println("factorial of "+number+"is: "+fact);
	}

}
