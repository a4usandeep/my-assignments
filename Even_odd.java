import java.util.Scanner;
public class Even_odd {
        public static void main(String[]abc) {
			int n;
			System.out.println("enter the number");
			Scanner scanner= new Scanner(System.in);
			n= scanner.nextInt();
			if(n%2 == 0) {
				System.out.println("the given number "+ n +" is even");
			}
			else
			{
				System.out.println("the given number "+ n +" is odd");
			}
		}
}
