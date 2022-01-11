import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		int a,b;
		System.out.println("enter a value of a: ");
		System.out.println("enter a value of b: ");
		Scanner scanner= new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("Result after swapping -a: "+ a +", b: " +b);
}

}
