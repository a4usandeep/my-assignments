import java.util.Scanner;
public class powerOfTwo {
	public static void main(String[] args)
	{
	int rem=0;
	Scanner scanner=new Scanner(System.in);
	int num=scanner.nextInt();
	if(num==0){
	System.out.println("no");
	}
	while (num!=1)	{

	rem=num%2;
	num=num/2;

	}

	if(num==1 && rem==0)	{

	System.out.println("yes");

	}

	else{

	System.out.println("no");

	}

	}

	}

